package com.studentregistrationms.hogwarts.service;

import com.studentregistrationms.hogwarts.dto.response.House;
import com.studentregistrationms.hogwarts.dto.response.Key;
import org.springframework.stereotype.Service;


public interface ApiService {

    Key getKey();

    House getHouse(String key);
}
