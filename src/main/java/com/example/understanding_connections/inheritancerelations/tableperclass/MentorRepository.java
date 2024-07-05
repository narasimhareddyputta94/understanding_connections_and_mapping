package com.example.understanding_connections.inheritancerelations.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("TPC-MentorRepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {

        @Override
        Mentor save(Mentor mentor);
}
