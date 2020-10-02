package com.kaushal.interviewbitclone.models;

import com.kaushal.interviewbitclone.utils.Constants;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;
@Getter
@Setter
public class USER {
    private UUID id;
    private String name;
    private Constants.Gender gender;

    public USER(String name, Constants.Gender gender)
    {   this.id =UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }
}
