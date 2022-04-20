package com.studentregistrationms.hogwarts.service;

import com.studentregistrationms.hogwarts.dto.request.StudentRequest;
import com.studentregistrationms.hogwarts.dto.response.StudentResponse;
import com.studentregistrationms.hogwarts.model.Student;

public interface StudentService {
    StudentResponse create(StudentRequest studentRequest);

    StudentResponse findById(Long id);
}
