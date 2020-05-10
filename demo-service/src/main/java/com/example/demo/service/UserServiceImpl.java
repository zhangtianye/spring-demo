package com.example.demo.service;

import com.example.demo.api.UserService;
import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String name) {
        User user = User.builder()
                .name(name)
                .build();
        return user.getName();
    }
}
