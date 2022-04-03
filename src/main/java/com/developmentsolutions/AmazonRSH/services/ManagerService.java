package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.models.Manager;
import com.developmentsolutions.AmazonRSH.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ManagerService {

    @Autowired
    ManagerRepository managerrepository;

    public List<Manager> getAll(){
        return managerrepository.findAll();
    }

    public Manager insertar (Manager manager) throws Exception{
        if(manager.getId()<1){
            throw new Exception("Invalid ID");
        }
        managerrepository.findAll().add(manager);
        return manager;
    }

}
