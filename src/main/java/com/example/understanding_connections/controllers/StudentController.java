package com.example.understanding_connections.controllers;


import com.example.understanding_connections.models.Student;
import com.example.understanding_connections.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private  StudentRepository studentRepository;

    public Optional<Student> getStudent(Long id) {
        Optional<Student>students =  studentRepository.findById(id);
        return students;


    }


}
