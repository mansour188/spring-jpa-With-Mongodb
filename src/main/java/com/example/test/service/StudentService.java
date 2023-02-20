package com.example.test.service;

import com.example.test.model.Student;
import com.example.test.repo.StudentReposotry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {
    StudentReposotry studentReposotry;

    public List<Student> getAllStudents() {
        return studentReposotry.findAll();
    }

    public void updateStudent(Student student) {

    }
}
