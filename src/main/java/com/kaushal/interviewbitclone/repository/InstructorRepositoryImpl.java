package com.kaushal.interviewbitclone.repository;

import com.kaushal.interviewbitclone.models.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstructorRepositoryImpl implements InstructorRepository {
    List<Instructor> InstructorDatabase = new ArrayList<>();
    @Override
    public Instructor createInstructor(Instructor instructor){
//        need to modify the instructor model and implementing the builder pattern
        Instructor newInstructor = new Instructor(  instructor.getName(),
                                                    instructor.getGender(),
                                                    instructor.getBatch(),
                                                    instructor.getSubject());
        InstructorDatabase.add(newInstructor);
        return newInstructor;
    }


}
