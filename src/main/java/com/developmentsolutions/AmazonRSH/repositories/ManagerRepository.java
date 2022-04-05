package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.Manager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class ManagerRepository {

    private List<Manager> managers = new ArrayList<>();//list to store managers

    //findAll() return the list with all the current managers
    public List<Manager> findAll(){
        return this.managers;
    }

    //Dummy() creates 3 dummy managers and store them in the list
    public void Dummy(){
        Manager m1 = new Manager();
        m1.setId(1);
        m1.setEnterprise("Amazon");
        m1.setUsername("manager1");
        m1.setPassword("pass1");

        Manager m2 = new Manager();
        m2.setId(2);
        m2.setEnterprise("Amazon");
        m2.setUsername("manager2");
        m2.setPassword("pass2");

        Manager m3 = new Manager();
        m3.setId(3);
        m3.setEnterprise("Amazon");
        m3.setUsername("manager3");
        m3.setPassword("pass3");

        this.managers.add(m1);
        this.managers.add(m2);
        this.managers.add(m3);
    }

}
