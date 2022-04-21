package com.studentregistrationms.hogwarts.service.impl;

import com.studentregistrationms.hogwarts.dto.response.House;
import com.studentregistrationms.hogwarts.dto.response.Key;
import com.studentregistrationms.hogwarts.service.ApiService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    private static final String KEY_URL = "https://api-harrypotter.herokuapp.com/sortinghat";
    private static final String HOUSE_URL = "https://api-harrypotter.herokuapp.com/house/{chavecasa}";


    @Override
    public Key getKey() {
        try{
            RestTemplate restTemplate = new RestTemplate();
//            HttpHeaders httpHeaders = new HttpHeaders();
//            httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
//            HttpEntity<?> httpEntity = new HttpEntity(httpHeaders);
            ResponseEntity<Key> key =  restTemplate.getForEntity(KEY_URL, Key.class);
//                    restTemplate.exchange(KEY_URL,
//                    HttpMethod.GET,
//                    httpEntity,
//                    Key.class);

            return key.getBody();
        }catch(RuntimeException e){

            throw new RuntimeException();
        }
    }

    @Override
    public House getHouse(String key) {

        try{

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
            HttpEntity<?> httpEntity = new HttpEntity(httpHeaders);
            ResponseEntity<House> house = restTemplate.exchange(
                    HOUSE_URL,
                    HttpMethod.GET,
                    httpEntity,
                    House.class,
                    key);

            return house.getBody();
        }catch(RuntimeException e){
            throw new RuntimeException();
        }
    }
}
