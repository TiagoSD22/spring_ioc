package com.example.springioc.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * SMS implementation of MessageService.
 */
@Service
@Primary
public class SmsService implements MessageService {
    
    @Override
    public String getMessage() {
        return "SMS: Hello from Spring IoC Container!";
    }
}
