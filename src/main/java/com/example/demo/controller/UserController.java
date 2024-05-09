package com.example.demo.controller;

import com.example.demo.model.response.GetResourceResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{resource}")
    public GetResourceResponseEntity getResource(@PathVariable String resource) {
        // Check user access and return success/failure
        return new GetResourceResponseEntity();
    }
}
