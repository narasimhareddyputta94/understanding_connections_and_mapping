package com.example.understanding_connections.inheritancerelations.singletable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity(name = "ST-Ta")
public class Ta  extends User {

    private String ta_session;

}
