package com.example.understanding_connections.inheritancerelations.mappedsuperclass;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<Mentor,Long> {

    @Override
    Mentor save(Mentor mentor);
}
