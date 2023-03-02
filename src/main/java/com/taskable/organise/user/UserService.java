package com.taskable.organise.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getAllUsers() {
        return "get all users";
    }

    public String getOneUser() { return "get a single user by id";}

    public void createUser() {}

    public void deleteUser() {}
}
