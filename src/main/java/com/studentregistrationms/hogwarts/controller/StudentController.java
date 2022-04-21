package com.studentregistrationms.hogwarts.controller;

import com.studentregistrationms.hogwarts.dto.request.StudentRequest;
import com.studentregistrationms.hogwarts.dto.response.StudentResponse;
import com.studentregistrationms.hogwarts.model.Student;
import com.studentregistrationms.hogwarts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public StudentResponse create(@RequestBody StudentRequest studentRequest){
        return studentService.create(studentRequest);
    }

    @GetMapping
    public StudentResponse findById(@RequestParam Long id){
        return studentService.findById(id);
    }
}
