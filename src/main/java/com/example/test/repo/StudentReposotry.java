package com.example.test.repo;

import com.example.test.model.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface StudentReposotry extends MongoRepository<Student,Integer> {
    Optional<Student> findStudentByEmail(String email);
}
