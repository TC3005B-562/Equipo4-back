package com.developmentsolutions.AmazonRSH.controllers;

import com.developmentsolutions.AmazonRSH.models.Manager;
import com.developmentsolutions.AmazonRSH.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")

public class ManagerController {

    @Autowired
    ManagerService managerservice;

    @GetMapping("/all") //shows all current managers
    public List<Manager> getAll(){
        return managerservice.getAll();
    }

    @GetMapping("/dummy") //adds dummy information
    public String Dummy(){
        managerservice.Dummy();
        return "Dummy information inserted!";
    }

    @PostMapping("/save") //saves a new manager
    public Manager save(@RequestBody Manager manager) throws Exception{
        managerservice.insert(manager);
        return manager;
    }

}
