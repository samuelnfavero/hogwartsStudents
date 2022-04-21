package com.studentregistrationms.hogwarts.service.impl;

import com.studentregistrationms.hogwarts.dto.response.House;
import com.studentregistrationms.hogwarts.dto.response.Key;
import com.studentregistrationms.hogwarts.dto.request.StudentRequest;
import com.studentregistrationms.hogwarts.dto.response.StudentResponse;
import com.studentregistrationms.hogwarts.exception.StudentNotFoundException;
import com.studentregistrationms.hogwarts.model.Student;
import com.studentregistrationms.hogwarts.repository.StudentRepository;
import com.studentregistrationms.hogwarts.service.ApiService;
import com.studentregistrationms.hogwarts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ApiService apiService;

    @Override
    public StudentResponse create(StudentRequest studentRequest) {

        Student student = new Student(studentRequest);
        Key key = apiService.getKey();
        student.setHouseKey(key.getKey());
        Student savedStudent = studentRepository.save(student);
        return new StudentResponse(savedStudent);
    }

    @Override
    public StudentResponse findById(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
        House house = apiService.getHouse(student.getHouseKey());

        return new StudentResponse(student, house);
    }
}
