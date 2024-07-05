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

        Student student3 = new Student();
        student3.setName("Alice Johnson");
        studentRepository.save(student3);

        Student student4 = new Student();
        student4.setName("Bob Brown");
        studentRepository.save(student4);

        Student student5 = new Student();
        student5.setName("Charlie White");
        studentRepository.save(student5);

        Student student6 = new Student();
        student6.setName("David Black");
        studentRepository.save(student6);

        Student student7 = new Student();
        student7.setName("Eve Green");
        studentRepository.save(student7);


    }
}
