package com.example.understanding_connections.inheritancerelations.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity(name = "MS-Ta")
public class Ta  extends User{

    private String ta_session;

}
