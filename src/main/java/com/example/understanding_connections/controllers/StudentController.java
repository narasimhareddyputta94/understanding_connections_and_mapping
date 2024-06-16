package com.example.understanding_connections.controllers;

import com.example.understanding_connections.models.Student;
import com.example.understanding_connections.repositories.StudentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    @Setter
    @Getter
    private StudentRepository studentRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getStudent(@PathVariable Long id) {
        if (id == null) {
            return new ResponseEntity<>("ID must not be null", HttpStatus.BAD_REQUEST);
        }
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent()) {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
        Student student = studentOptional.get();
        student.setName(studentDetails.getName());
        studentRepository.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteStudent(@PathVariable Long id) {
        if (!studentRepository.existsById(id)) {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
        studentRepository.deleteById(id);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
    }
}
