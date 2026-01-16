package com.example.springioc;

import com.example.springioc.component.ConstructorInjectionDemo;
import com.example.springioc.component.QualifierDemo;
import com.example.springioc.component.SetterInjectionDemo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Main Spring Boot application that demonstrates Inversion of Control (IoC).
 * 
 * Key IoC Concepts Demonstrated:
 * 1. Dependency Injection (DI)
 * 2. Constructor Injection
 * 3. Setter Injection
 * 4. @Qualifier for multiple implementations
 * 5. @Primary annotation
 * 6. Component Scanning
 */
@SpringBootApplication
public class SpringIocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);
    }
    

    @Bean
    public CommandLineRunner demo(ApplicationContext context,
                                   ConstructorInjectionDemo constructorDemo,
                                   SetterInjectionDemo setterDemo,
                                   QualifierDemo qualifierDemo) {
        return args -> {
            System.out.println("\n========================================");
            System.out.println("Spring IoC Container Demonstration");
            System.out.println("========================================\n");
            
            System.out.println("Total beans managed by Spring: " + context.getBeanDefinitionCount());
            System.out.println();
            
            System.out.println("--- Constructor Injection Demo ---");
            constructorDemo.sendMessage();
            System.out.println();
            
            System.out.println("--- Setter Injection Demo ---");
            setterDemo.sendMessage();
            System.out.println();
            
            System.out.println("--- Qualifier Demo (Email Service) ---");
            qualifierDemo.sendMessage();
            System.out.println();
            
            System.out.println("========================================");
            System.out.println("Key Points:");
            System.out.println("1. Spring creates and manages all beans");
            System.out.println("2. Dependencies are injected automatically");
            System.out.println("3. We don't use 'new' keyword for beans");
            System.out.println("4. @Primary defines default implementation");
            System.out.println("5. @Qualifier specifies exact bean to inject");
            System.out.println("========================================\n");
        };
    }
}
