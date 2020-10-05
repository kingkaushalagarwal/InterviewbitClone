package com.kaushal.interviewbitclone.services;

import com.kaushal.interviewbitclone.models.USER;
import com.kaushal.interviewbitclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public USER createUser(USER user){
        return userRepository.createUser(user);
    }

    public USER getUser(UUID id) {
        Optional<USER> foundUser = userRepository.getUserByID(id);
        if(foundUser.isEmpty()){
            return null;
        }
        return foundUser.get();
    }

}
