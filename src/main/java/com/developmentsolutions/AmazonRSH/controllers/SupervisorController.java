package com.developmentsolutions.AmazonRSH.controllers;


import com.developmentsolutions.AmazonRSH.models.Supervisor;
import com.developmentsolutions.AmazonRSH.services.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supervisor")

public class SupervisorController {

    @Autowired
    SupervisorService supervisorservice;

    @GetMapping("/all")
    public List<Supervisor> getAll(){
        return supervisorservice.getAll();
    }

    @GetMapping("/dummy")
    public String Dummy(){
        supervisorservice.Dummy();
        return "Dummy information inserted!";
    }

    @PostMapping("/save")
    public Supervisor save(@RequestBody Supervisor supervisor) throws Exception{
        supervisorservice.insertar(supervisor);
        return supervisor;
    }

}
