package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMainApplication {

    private static final Logger logger = LoggerFactory.getLogger(DemoMainApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoMainApplication.class, args);
    }

}
