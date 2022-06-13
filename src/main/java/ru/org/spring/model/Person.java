package ru.org.spring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="email")
    private String email;


}
