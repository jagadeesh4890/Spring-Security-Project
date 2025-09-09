package com.example.projectone.Repository;

import com.example.projectone.Objects.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface studentRepo extends JpaRepository<student, Serializable> {

}
