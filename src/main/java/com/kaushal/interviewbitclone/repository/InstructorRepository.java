package com.kaushal.interviewbitclone.repository;

import com.kaushal.interviewbitclone.models.Instructor;

import java.util.Optional;
import java.util.UUID;

public interface InstructorRepository {
    Instructor createInstructor(Instructor instructor);
    Optional<Instructor> getInstructorById(UUID id);
}
