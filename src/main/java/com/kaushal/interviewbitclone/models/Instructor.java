package com.kaushal.interviewbitclone.models;
import com.kaushal.interviewbitclone.utils.Constants;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class Instructor {
    private UUID id;
    private String name;
    private Constants.Gender gender;
    private String batch;
    private Constants.Subject subject;
    public Instructor(String name, Constants.Gender gender, String batch, Constants.Subject subject)
    {   this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
        this.batch = batch;
        this.subject = subject;
    }

}
