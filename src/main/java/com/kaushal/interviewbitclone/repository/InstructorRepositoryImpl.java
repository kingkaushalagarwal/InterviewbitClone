package com.kaushal.interviewbitclone.repository;

import com.kaushal.interviewbitclone.models.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class InstructorRepositoryImpl implements InstructorRepository {
    List<Instructor> InstructorDatabase = new ArrayList<>();
    @Override
    public Instructor createInstructor(Instructor instructor){
//        need to modify the instructor model and implementing the builder pattern
        System.out.print("instructor name "+instructor.getName());
        Instructor newInstructor = new Instructor(  instructor.getName(),
                                                    instructor.getGender(),
                                                    instructor.getBatch(),
                                                    instructor.getSubject());

        System.out.println(newInstructor.getName());
        InstructorDatabase.add(newInstructor);
        return newInstructor;
    }

    @Override
    public Optional<Instructor> getInstructorById(UUID id){
        return InstructorDatabase.stream()
                .filter(
                        instructor->instructor.getId().equals(id)
                )
                .findFirst();


    }


}
