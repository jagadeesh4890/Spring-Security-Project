package com.example.projectone.services;

import com.example.projectone.Objects.student;
import com.example.projectone.Objects.users;
import com.example.projectone.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class userServiceImpl implements userService{

    @Autowired
    public UserRepo repo;

    @Autowired
    private JWTService jwtservice;
    @Autowired
    AuthenticationManager authManager;

    @Override
    public users register(users user)
    {
        return repo.save(user);
    }

    @Override
    public users getTheRecord(int Id) {
        Optional< users > findByID = repo.findById(Id);
        return findByID.orElse(null);
    }

    @Override
    public String verify(users user) {
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));

        if(authentication.isAuthenticated())
        {
            return jwtservice.generatetoken(user.getUsername());
        }
        return "fail";
    }
}
