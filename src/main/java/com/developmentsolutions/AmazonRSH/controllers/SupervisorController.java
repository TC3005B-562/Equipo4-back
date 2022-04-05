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

    @GetMapping("/all") //shows all current supervisors
    public List<Supervisor> getAll(){
        return supervisorservice.getAll();
    }

    @GetMapping("/dummy") //adds dummy information
    public String Dummy(){
        supervisorservice.Dummy();
        return "Dummy information inserted!";
    }

    @PostMapping("/save") //saves a new supervisor
    public Supervisor save(@RequestBody Supervisor supervisor) throws Exception{
        supervisorservice.insert(supervisor);
        return supervisor;
    }

}
