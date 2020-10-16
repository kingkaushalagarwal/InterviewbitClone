package com.kaushal.interviewbitclone.controllers;
import com.kaushal.interviewbitclone.dto.ResponseDto;
import com.kaushal.interviewbitclone.models.Instructor;
import com.kaushal.interviewbitclone.services.InstructorService;
import com.kaushal.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.INSTRUCTOR_END_POINT)
public class InstructorController {
    private InstructorService instructorService;
    @Autowired
    InstructorController(InstructorService instructorService){
        this.instructorService = instructorService;
    }
    @PostMapping
    public Instructor createInstructor(@RequestBody Instructor instructor){
        return instructorService.createInstructor(instructor);
    }

    @GetMapping("/{id}")
    public ResponseDto getInstructorById(@PathVariable(name="id") UUID id){
        Instructor serviceResponse = instructorService.getInstructorById(id);
        if(serviceResponse==null){
            return new ResponseDto(HttpStatus.NOT_FOUND, serviceResponse);
        }
        else{
            return new ResponseDto(HttpStatus.FOUND, serviceResponse);
        }
    }
}
