package com.kaushal.interviewbitclone.controllers;
import com.kaushal.interviewbitclone.models.Instructor;
import com.kaushal.interviewbitclone.services.InstructorService;
import com.kaushal.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.INSTRUCTOR_END_POINT)
public class InstructorController {
    private InstructorService instructorService;
    @Autowired
    InstructorController(InstructorService instructorService){
        this.instructorService = instructorService;
    }
    @PostMapping
    public Instructor createInstructor(Instructor instructor){
        return instructorService.createInstructor(instructor);
    }

}
