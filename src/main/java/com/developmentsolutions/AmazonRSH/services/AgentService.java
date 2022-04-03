package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.models.Agent;
import com.developmentsolutions.AmazonRSH.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AgentService {

    @Autowired
    AgentRepository agentrepository;

    public List<Agent> getAll(){
        return agentrepository.findAll();
    }

    public Agent insertar (Agent agent) throws Exception{
        if(agent.getId()<1){
            throw new Exception("Invalid ID");
        }
        agentrepository.findAll().add(agent);
        return agent;
    }
}
