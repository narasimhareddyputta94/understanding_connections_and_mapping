package com.example.understanding_connections.inheritancerelations.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity(name = "TPC-Ta")
public class Ta  extends User {

    private String ta_session;

}
