package com.studentregistrationms.hogwarts.service.impl;

import com.studentregistrationms.hogwarts.dto.request.StudentRequest;
import com.studentregistrationms.hogwarts.dto.response.StudentResponse;
import com.studentregistrationms.hogwarts.exception.StudentNotFoundException;
import com.studentregistrationms.hogwarts.model.Student;
import com.studentregistrationms.hogwarts.repository.StudentRepository;
import com.studentregistrationms.hogwarts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentResponse create(StudentRequest studentRequest) {

        Student student = new Student(studentRequest);

        //TODO chama na api dele

        Student savedStudent = studentRepository.save(student);

        return new StudentResponse(savedStudent);
    }

    @Override
    public StudentResponse findById(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));

        return new StudentResponse(student);
    }
}
