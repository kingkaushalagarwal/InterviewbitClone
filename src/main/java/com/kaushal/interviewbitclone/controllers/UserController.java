package com.kaushal.interviewbitclone.controllers;

import com.kaushal.interviewbitclone.dto.ResponseDto;
import com.kaushal.interviewbitclone.models.USER;
import com.kaushal.interviewbitclone.services.UserService;
import com.kaushal.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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
    @GetMapping("/{id}")
    public ResponseDto<USER> getUser(@PathVariable(name="id") UUID id){
        USER serviceResponse =  userService.getUser(id);
        if(serviceResponse==null) {
            return new ResponseDto(HttpStatus.NOT_FOUND, serviceResponse);
        }
        return new ResponseDto(HttpStatus.FOUND,serviceResponse);

    }

}
