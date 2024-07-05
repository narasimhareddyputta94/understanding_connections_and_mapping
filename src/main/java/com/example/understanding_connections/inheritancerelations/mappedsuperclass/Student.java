package com.example.understanding_connections.inheritancerelations.mappedsuperclass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Student  extends User{

    private String grade;
}
