package com.example.springioc.service;

import org.springframework.stereotype.Service;

/**
 * Email implementation of MessageService.
 */
@Service
public class EmailService implements MessageService {
    
    @Override
    public String getMessage() {
        return "Email: Hello from Spring IoC Container!";
    }
}
