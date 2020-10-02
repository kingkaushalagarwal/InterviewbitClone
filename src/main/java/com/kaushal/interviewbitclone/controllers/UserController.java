package com.kaushal.interviewbitclone.controllers;

import com.kaushal.interviewbitclone.models.USER;
import com.kaushal.interviewbitclone.services.UserService;
import com.kaushal.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.USER_END_POINT)
public class UserController {
    private UserService userService;

    @Autowired
    UserController(UserService userservice){
        this.userService = userservice;
    }
    @PostMapping
    public USER createUser(@RequestBody USER user){
        return userService.createUser(user);
    }
}
