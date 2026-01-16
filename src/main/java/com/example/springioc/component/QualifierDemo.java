package com.example.springioc.component;

import com.example.springioc.service.EmailService;
import com.example.springioc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Demonstrates using @Qualifier to specify which bean to inject
 * when multiple implementations of the same interface exist.
 */
@Component
public class QualifierDemo {
    
    private final MessageService emailService;
    
    @Autowired
    public QualifierDemo(@Qualifier("emailService") MessageService emailService) {
        this.emailService = emailService;
        System.out.println("QualifierDemo: Constructor called with EmailService");
    }
    
    public void sendMessage() {
        System.out.println("Qualifier Demo: " + emailService.getMessage());
    }
}
