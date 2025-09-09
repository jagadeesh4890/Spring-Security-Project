package com.example.projectone.Controller;

import com.example.projectone.Objects.student;
import com.example.projectone.Objects.users;
import com.example.projectone.services.JWTService;
import com.example.projectone.services.studentSer;
import com.example.projectone.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class JPAController {

    @Autowired
    private studentSer studser;

    @Autowired
    private userService service;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    @GetMapping("getstudent/{id}")
    public student getStudent(@PathVariable int id)
    {
        return studser.getTheRecord(id);
    }

    @GetMapping("getuser/{id}")
    public users getUser(@PathVariable int id)
    {
        return service.getTheRecord(id);
    }

    @PostMapping(value="register",consumes = MediaType.APPLICATION_JSON_VALUE)
    public users register(@RequestBody users user)
    {
        user.setPassword(encoder.encode(user.getPassword()));
        return service.register(user);
    }

    @PostMapping(value="login",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody users user)
    {
       return service.verify(user);
    }

}
