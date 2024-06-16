package com.example.understanding_connections.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters

}
