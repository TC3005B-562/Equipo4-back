package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.Supervisor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class SupervisorRepository {

    public List<Supervisor> findAll(){
        Supervisor s1 = new Supervisor();
        s1.setId(1);
        s1.setAsosiation("Amazon");
        s1.setManager_id(1);
        s1.setUsername("agente1");
        s1.setPassword("pass1");

        Supervisor s2 = new Supervisor();
        s2.setId(2);
        s2.setAsosiation("Amazon");
        s2.setManager_id(1);
        s2.setUsername("agente2");
        s2.setPassword("pass2");

        Supervisor s3 = new Supervisor();
        s3.setId(3);
        s3.setAsosiation("Amazon");
        s3.setManager_id(1);
        s3.setUsername("agente3");
        s3.setPassword("pass3");

        List<Supervisor> supervisors = new ArrayList<>();
        supervisors.add(s1);
        supervisors.add(s2);
        supervisors.add(s3);

        return supervisors;
    }

}
