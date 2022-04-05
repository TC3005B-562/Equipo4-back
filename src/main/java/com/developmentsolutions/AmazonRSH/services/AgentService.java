package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.models.Agent;
import com.developmentsolutions.AmazonRSH.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AgentService {

    @Autowired
    AgentRepository agentrepository; //variable which allows storing agents into the repository

    //getAll() is a function to return the current agents
    public List<Agent> getAll(){
        return agentrepository.findAll();
    }

    //Dummy() calls the function from the AgentRepository class to store dummy agents in the current repository
    public void Dummy(){
        agentrepository.Dummy();
    }

    //insert(Manager) stores a specific agent in the repository
    public Agent insert (Agent agent) throws Exception{
        if(agent.getId()<1){
            throw new Exception("Invalid ID");
        }
        agentrepository.findAll().add(agent);
        return agent;
    }
}
