package com.github_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoTest {
    @GetMapping
    public String helloworld(){
        return "To-do Application";
    }
    @PostMapping
    public String helloworld2(){
        return "To-do Application2";
    }
}
