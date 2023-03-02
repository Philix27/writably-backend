package com.taskable.organise.user;

import com.taskable.organise.OrganiseApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/users")
public record UserController(UserService userService) {


    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String  getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("{id}")
    public String  findAUser(){
        return userService.getOneUser();
    }
}
