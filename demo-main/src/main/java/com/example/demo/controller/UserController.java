package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.impl.UserImpl;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserImpl userImpl;

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    @ResponseBody
    public String getUserName(@PathParam("name") String name) {
        return userImpl.getUserName(name);
    }
}
