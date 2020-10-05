package com.kaushal.interviewbitclone.services;

import com.kaushal.interviewbitclone.models.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kaushal.interviewbitclone.repository.InstructorRepository;
@Service
public class InstructorService {
    private InstructorRepository instructorRepository;

    @Autowired
    InstructorService(InstructorRepository instructorRepository){
        this.instructorRepository = instructorRepository;
    }

    public Instructor createInstructor(Instructor instructor){
        return instructorRepository.createInstructor(instructor);
    }

}
