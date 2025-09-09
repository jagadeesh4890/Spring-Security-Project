package com.example.projectone.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class users {
    @Id
    private int userId;
    private String username;
    private String password;

}
