package com.developmentsolutions.AmazonRSH.controllers;

import com.developmentsolutions.AmazonRSH.models.Call;
import com.developmentsolutions.AmazonRSH.services.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/call")

public class CallController {

    @Autowired
    CallService callservice;

    @GetMapping("/all")
    public List<Call> getAll() {return callservice.getAll();}

    @GetMapping("/insert") //adds dummy information
    public String insert(){
        callservice.loadCalls();
        return "Information inserted!";
    }

    @PostMapping("/save") //saves a new agent
    public Call save(@RequestBody Call employee) throws Exception{
        callservice.insert(employee);
        return employee;
    }

}

