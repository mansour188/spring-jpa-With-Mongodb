
package com.example.test.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
@Data
@Document

public class Student {
    @Id
   private   String id;
    private String firstname;
    private String lastname;
    @Indexed(unique = true)
    private String email;
    private Gender gender;
    private Address address;
    private List<String>  favoriteSubjucts;
    private BigDecimal totaleSoentIBooks;
    private LocalDateTime created;

    public Student(String firstname, String lastname, String email, Gender gender, Address address, List<String> favoriteSubjucts, BigDecimal totaleSoentIBooks, LocalDateTime created) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.favoriteSubjucts = favoriteSubjucts;
        this.totaleSoentIBooks = totaleSoentIBooks;
        this.created = created;
    }
}
