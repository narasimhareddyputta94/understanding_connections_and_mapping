package com.example.understanding_connections.inheritancerelations.singletable;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "ST-Students")
public class Students extends User {

    private String grade;
}
