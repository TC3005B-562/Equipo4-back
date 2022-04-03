package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.Agent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AgentRepository {

    public List<Agent> findAll(){
        Agent a1 = new Agent();
        a1.setId(1);
        a1.setAsosiation("Amazon");
        a1.setSupervisor_id(1);
        a1.setUsername("agente1");
        a1.setPassword("pass1");

        Agent a2 = new Agent();
        a2.setId(2);
        a2.setAsosiation("Amazon");
        a2.setSupervisor_id(1);
        a2.setUsername("agente2");
        a2.setPassword("pass2");

        Agent a3 = new Agent();
        a3.setId(3);
        a3.setAsosiation("Amazon");
        a3.setSupervisor_id(1);
        a3.setUsername("agente3");
        a3.setPassword("pass3");

        List<Agent> agents = new ArrayList<>();
        agents.add(a1);
        agents.add(a2);
        agents.add(a3);

        return agents;
    }
}
