package com.github_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoTest {
    @GetMapping
    public String helloworld(){
        return "To-do Application";
    }
}
