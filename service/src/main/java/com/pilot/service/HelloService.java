package com.pilot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "Hello, Welcome to the pilot";
    }
}
