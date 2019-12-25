package com.example.project;

import javax.persistence.*;

@Entity
@Table
public class Employe {

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
