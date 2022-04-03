package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.Manager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class ManagerRepository {

    public List<Manager> findAll(){
        Manager m1 = new Manager();
        m1.setId(1);
        m1.setEnterprise("Amazon");
        m1.setUsername("agente1");
        m1.setPassword("pass1");

        Manager m2 = new Manager();
        m2.setId(2);
        m2.setEnterprise("Amazon");
        m2.setUsername("agente2");
        m2.setPassword("pass2");

        Manager m3 = new Manager();
        m3.setId(3);
        m3.setEnterprise("Amazon");
        m3.setUsername("agente3");
        m3.setPassword("pass3");

        List<Manager> managers = new ArrayList<>();
        managers.add(m1);
        managers.add(m2);
        managers.add(m3);

        return managers;
    }

}
