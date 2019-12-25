package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class controller {
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
