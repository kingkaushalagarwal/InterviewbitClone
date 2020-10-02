package com.kaushal.interviewbitclone;
import java.io.*;
import java.util.*;
import com.kaushal.interviewbitclone.models.USER;
import com.kaushal.interviewbitclone.utils.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewbitcloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewbitcloneApplication.class, args);
        USER user = new USER("Kaushal", Constants.Gender.MALE);
        System.out.println(user.getName());

    }

}
