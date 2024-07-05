package com.example.understanding_connections.inheritancerelations.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "TPC-Mentor")
public class Mentor extends User {
        private String mentor_session;
}
