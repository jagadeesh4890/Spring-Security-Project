package com.example.projectone.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class subjects {
    @Id
    private int studentId;
    private String maths;
    private String science;
    private String social;
    private String telugu;
}
