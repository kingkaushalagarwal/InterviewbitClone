package com.kaushal.interviewbitclone.repository;

import com.kaushal.interviewbitclone.models.USER;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private List<USER> userDatabase = new ArrayList<>();

    @Override
    public USER createUser(USER user){
        USER createUser = new USER(user.getName(),user.getGender());
        userDatabase.add(createUser);
        return null;

    }
}
