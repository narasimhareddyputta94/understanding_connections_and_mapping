package com.example.understanding_connections.inheritancerelations.singletable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ST-MentorRepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {

@Override
        Mentor save(Mentor mentor);
}
