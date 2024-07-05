package com.example.understanding_connections.inheritancerelations.joinedtable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity(name = "JT-Ta")
public class Ta  extends User {

    private String ta_session;

}
