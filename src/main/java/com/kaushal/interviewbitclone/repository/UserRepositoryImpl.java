package com.kaushal.interviewbitclone.repository;

import com.kaushal.interviewbitclone.models.USER;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository{
    private List<USER> userDatabase = new ArrayList<>();

    @Override
    public USER createUser(USER user){
        USER createUser = new USER(user.getName(),user.getGender());
        userDatabase.add(createUser);
        return createUser;

    }

    @Override
    public Optional<USER> getUserByID(UUID id)
    {   return userDatabase.stream()
            .filter(
                    user -> user.getId().equals(id)
            ).findFirst();

    }

}
