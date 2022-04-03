package com.developmentsolutions.AmazonRSH.controllers;

import com.developmentsolutions.AmazonRSH.models.Agent;
import com.developmentsolutions.AmazonRSH.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")

public class AgentController {

    @Autowired
    AgentService agentservice;

    @GetMapping("/all")
    public List<Agent> getAll(){
        return agentservice.getAll();
    }

    @GetMapping("/dummy")
    public String Dummy(){
        agentservice.Dummy();
        return "Dummy information inserted!";
    }

    @PostMapping("/save")
    public Agent save(@RequestBody Agent agent) throws Exception{
        agentservice.insertar(agent);
        return agent;
    }

}
