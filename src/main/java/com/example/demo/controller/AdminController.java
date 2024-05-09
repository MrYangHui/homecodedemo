package com.example.demo.controller;

import com.example.demo.model.request.UserAccessRequest;
import com.example.demo.model.response.AddUserResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/addUser")
    public AddUserResponseEntity addUserAccess(@RequestBody UserAccessRequest request) {
        // Add user access to the file-based persistence
        return new AddUserResponseEntity();
    }
}
