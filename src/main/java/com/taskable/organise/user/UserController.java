package com.taskable.organise.user;

import com.taskable.organise.OrganiseApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class UserController {


    @GetMapping("/user")
    public String greet(){
        return "Hello Friend";
    }

}
