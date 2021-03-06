package com.studentregistrationms.hogwarts.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class House {
    private String name;
    private String animal;
    private String founder;
    private List<Value> values;
}
