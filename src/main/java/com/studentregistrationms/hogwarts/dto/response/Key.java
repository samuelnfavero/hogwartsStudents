package com.studentregistrationms.hogwarts.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class Key {
    @JsonProperty("sorting-hat-choice")
    private String sortingHatChoice;
}
