package com.example.understanding_connections.inheritancerelations.tableperclass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity(name = "TPC-Students")
public class Students extends User {

    private String grade;
}
