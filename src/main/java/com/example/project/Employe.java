package com.example.project;

<<<<<<< HEAD
import javax.persistence.*;
=======

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
>>>>>>> origin/master

@Entity
@Table
public class Employe {
<<<<<<< HEAD

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
=======
    @Column
    private String name;
    @Column
    @Id
    private int id;
>>>>>>> origin/master

    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public Long getId() {
=======
    public int getId() {
>>>>>>> origin/master
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public void setId(Long id) {
=======
    public void setId(int id) {
>>>>>>> origin/master
        this.id = id;
    }
}
