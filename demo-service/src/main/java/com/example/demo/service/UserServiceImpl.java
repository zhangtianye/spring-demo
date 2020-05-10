package com.example.demo.service;

import com.example.demo.api.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String name) {
        return name;
    }
}
