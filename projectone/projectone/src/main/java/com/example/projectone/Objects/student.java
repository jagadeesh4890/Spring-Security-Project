package com.example.projectone.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class student {
    @Id
    private int id;
    private String first_name;
    private String second_name;
    private double grade;
    private String college;
}
