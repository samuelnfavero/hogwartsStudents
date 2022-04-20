package com.studentregistrationms.hogwarts.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id){
        super(String.format("Student not found with id %s", id));
    }
}
