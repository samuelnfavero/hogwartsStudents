package com.studentregistrationms.hogwarts.dto.response;

import com.studentregistrationms.hogwarts.model.Student;


public class StudentResponse {

    private String name;
    private int grade;
    private House house;

    public StudentResponse(Student student){
        this.name = student.getName();
        this.grade = student.getGrade();
        this.house = house;
    }

    public StudentResponse(Student student, House house){
        this.name = student.getName();
        this.grade = student.getGrade();
        this.house = house;
    }
}
