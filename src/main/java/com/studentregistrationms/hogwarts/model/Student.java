package com.studentregistrationms.hogwarts.model;

import com.studentregistrationms.hogwarts.dto.request.StudentRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private int grade;
    @Column
    private String houseKey;

    public Student(StudentRequest studentRequest){
        this.name = studentRequest.getName();
        this.grade = studentRequest.getGrade();
    }
}
