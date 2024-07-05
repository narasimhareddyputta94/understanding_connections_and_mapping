package com.example.understanding_connections.inheritancerelations.joinedtable;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "JT-Students")
public class Students extends User {

    private String grade;
}
