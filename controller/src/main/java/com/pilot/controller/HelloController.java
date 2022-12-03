package com.pilot.controller;


import com.pilot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private HelloService helloService;

    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping("/pilot")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>(helloService.hello(), HttpStatus.OK);
    }
}
