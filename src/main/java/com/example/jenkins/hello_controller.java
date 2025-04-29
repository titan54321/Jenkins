package com.example.jenkins;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_controller {


    @GetMapping
    public  String hello() {
        return "Hello World";
    }

}
