package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(value="service")
public class DemoMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMainApplication.class, args);
    }

}
