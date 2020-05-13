package com.example.demo.service;

import com.example.demo.api.UserService;
import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements UserService {

    final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String getUserName(String name) {
        User user = User.builder()
                .name(name)
                .build();
        logger.info(name);
        return user.getName();
    }
}
