package com.example.understanding_connections.inheritancerelations.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity(name = "MS-Mentor")
public class Mentor extends User{

        private String mentor_session;
}
