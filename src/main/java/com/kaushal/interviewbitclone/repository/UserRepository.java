package com.kaushal.interviewbitclone.repository;

import com.kaushal.interviewbitclone.models.USER;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.Optional;
//@Repository
public interface UserRepository {
    USER createUser(USER user);
    Optional<USER> getUserByID(UUID id);

}
