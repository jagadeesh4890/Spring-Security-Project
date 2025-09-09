package com.example.projectone.services;


import com.example.projectone.Objects.users;

public interface userService {
    users register(users user);

    users getTheRecord(int Id);

    String verify(users user);
}
