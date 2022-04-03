package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.Supervisor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class SupervisorRepository {

    private List<Supervisor> supervisors = new ArrayList<>();

    public List<Supervisor> findAll(){
        return this.supervisors;
    }

    public void Dummy(){
        Supervisor s1 = new Supervisor();
        s1.setId(1);
        s1.setAsosiation("Amazon");
        s1.setManager_id(1);
        s1.setUsername("supervisor1");
        s1.setPassword("pass1");

        Supervisor s2 = new Supervisor();
        s2.setId(2);
        s2.setAsosiation("Amazon");
        s2.setManager_id(1);
        s2.setUsername("supervisor2");
        s2.setPassword("pass2");

        Supervisor s3 = new Supervisor();
        s3.setId(3);
        s3.setAsosiation("Amazon");
        s3.setManager_id(1);
        s3.setUsername("supervisor3");
        s3.setPassword("pass3");

        this.supervisors.add(s1);
        this.supervisors.add(s2);
        this.supervisors.add(s3);
    }

}
