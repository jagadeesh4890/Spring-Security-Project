package com.example.projectone.Repository;

import com.example.projectone.Objects.subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface subjectsRepo extends JpaRepository<subjects, Serializable> {

}
