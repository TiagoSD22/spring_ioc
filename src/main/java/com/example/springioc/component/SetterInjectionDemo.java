package com.example.springioc.component;

import com.example.springioc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Demonstrates Setter Injection.
 * Less preferred than constructor injection but useful for optional dependencies.
 */
@Component
public class SetterInjectionDemo {
    
    private MessageService messageService;
    
    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
        System.out.println("SetterInjectionDemo: Setter called with MessageService");
    }
    
    public void sendMessage() {
        System.out.println("Setter Injection: " + messageService.getMessage());
    }
}
