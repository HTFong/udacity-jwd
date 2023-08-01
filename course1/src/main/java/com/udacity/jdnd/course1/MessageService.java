package com.udacity.jdnd.course1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class MessageService {
    private String message;
    MessageService(String message){
        this.message = message;
    }
    String uppercase() {
        return this.message.toUpperCase();
    }
    String lowercase() {
        return this.message.toLowerCase();
    }
}
