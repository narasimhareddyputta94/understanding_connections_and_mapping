package com.example.understanding_connections;

import com.example.understanding_connections.models.Student;
import com.example.understanding_connections.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        // Insert initial data
        Student student1 = new Student();
        student1.setName("John Doe");
        studentRepository.save(student1);

        Student student2 = new Student();
        student2.setName("Jane Smith");
        studentRepository.save(student2);

        // Add more initial data as needed
    }
}
