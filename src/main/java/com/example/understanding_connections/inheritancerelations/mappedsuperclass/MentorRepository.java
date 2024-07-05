package com.example.understanding_connections.inheritancerelations.mappedsuperclass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MS-MentorRepository")
public interface MentorRepository extends JpaRepository<Mentor,Long> {

    @Override
    Mentor save(Mentor mentor);
}
