package com.example.project;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/emp")
public class Controller {
    @Autowired
    private EmployeRepository rep;

    @GetMapping("/getAll")
    public List<Employe> getEmployee(){

        return rep.findAll();
    }
    @PostMapping("/createEmp")
    public Employe createEmploye(Employe employe){
    return rep.save(employe);
    }
}

