package com.example.projectone.services;

import com.example.projectone.Objects.student;
import com.example.projectone.Repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class studentimpl implements studentSer{

    @Autowired
    public studentRepo stud;

    @Override
    public student getTheRecord(int Id) {
        Optional<student> findByID = stud.findById(Id);
        return findByID.orElse(null);
    }
}
