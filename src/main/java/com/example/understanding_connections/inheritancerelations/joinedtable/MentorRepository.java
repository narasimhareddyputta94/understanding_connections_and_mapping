package com.example.understanding_connections.inheritancerelations.joinedtable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("JT-MentorRepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {

            @Override
            Mentor save(Mentor mentor);

    Students save(Students student);
}
