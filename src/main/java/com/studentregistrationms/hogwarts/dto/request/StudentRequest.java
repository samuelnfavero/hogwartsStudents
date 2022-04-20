package com.studentregistrationms.hogwarts.dto.request;

import com.studentregistrationms.hogwarts.model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StudentRequest {

    private String name;
    private int grade;

}
