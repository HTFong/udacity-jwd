package com.udacity.jdnd.course1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Course1Application {
//
//    @Bean
//    public String message() {
//        return "Hello,Spring!";
//    }
//    @Autowired
//    MessageService messageService;
//    @Bean
//    public String uppercaseMessage() {
//        return messageService.uppercase();
//    }
//    @Bean
//    public String lowercaseMessage() {
//        return messageService.lowercase();
//
//    }
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Course1Application.class, args);
//        MessageService messageService1 = (MessageService) context.getBean("messageService");
//        System.out.println(messageService1.lowercase());

    }

}
