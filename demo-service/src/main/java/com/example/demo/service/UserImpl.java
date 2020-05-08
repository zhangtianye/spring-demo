package com.example.demo.service;

import com.example.demo.api.User;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements User {

    @Override
    public String getUserName(String name) {
        return name;
    }
}
