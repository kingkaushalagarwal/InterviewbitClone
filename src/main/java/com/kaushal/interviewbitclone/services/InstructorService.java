package com.kaushal.interviewbitclone.services;

import com.kaushal.interviewbitclone.models.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kaushal.interviewbitclone.repository.InstructorRepository;

import java.util.Optional;
import java.util.UUID;

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

    public Instructor getInstructorById(UUID id){
        Optional<Instructor> instructor = instructorRepository.getInstructorById(id);
        if(instructor.isEmpty()){
            return null;
        }
        return instructor.get();
    }

}
