package com.example.springioc.component;

import com.example.springioc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Demonstrates Constructor Injection (Recommended approach).
 * Spring automatically injects the MessageService dependency.
 */
@Component
public class ConstructorInjectionDemo {
    
    private final MessageService messageService;
    
    @Autowired
    public ConstructorInjectionDemo(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("ConstructorInjectionDemo: Constructor called with MessageService");
    }
    
    public void sendMessage() {
        System.out.println("Constructor Injection: " + messageService.getMessage());
    }
}
