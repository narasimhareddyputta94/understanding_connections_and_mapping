package com.example.understanding_connections.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Laptop {

    @Id
    private Long id;

    private String brand;

    private String model;

    private String serialNumber;

    @ManyToOne
    private Student student;

}
