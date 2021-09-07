package com.example.primary.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column
    private String name;

    @Column
    private String rollNo;
}
