package com.kaushal.interviewbitclone.repository;

import com.kaushal.interviewbitclone.models.USER;
import org.springframework.stereotype.Repository;

public interface UserRepository {
    USER createUser(USER user);

}
