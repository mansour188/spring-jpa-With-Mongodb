package com.example.test.controller;

import com.example.test.model.Student;
import com.example.test.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();

    }

    @PutMapping("/updta")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);

    }
}
