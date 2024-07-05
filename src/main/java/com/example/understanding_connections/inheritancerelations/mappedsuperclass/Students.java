package com.example.understanding_connections.inheritancerelations.mappedsuperclass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "MS-Students")
public class Students extends User{

    private String grade;
}
