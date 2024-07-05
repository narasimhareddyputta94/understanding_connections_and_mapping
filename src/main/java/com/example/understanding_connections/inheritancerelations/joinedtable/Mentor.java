package com.example.understanding_connections.inheritancerelations.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "JT-Mentor")
public class Mentor extends User {
        private String mentorSession;
}
