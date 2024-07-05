package com.example.understanding_connections.inheritancerelations.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@DiscriminatorValue("Mentor")
public class Mentor extends User {
        private String mentor_session;
}
