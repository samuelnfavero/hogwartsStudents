package com.studentregistrationms.hogwarts.dto.response;

import com.studentregistrationms.hogwarts.dto.request.House;
import com.studentregistrationms.hogwarts.model.Student;
import lombok.AllArgsConstructor;


public class StudentResponse {

    private String name;
    private int grade;
    private House house;


    public StudentResponse(Student student){
        this.name = student.getName();
        this.grade = student.getGrade();
    }
}
