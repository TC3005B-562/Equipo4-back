package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.models.Manager;
import com.developmentsolutions.AmazonRSH.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ManagerService {

    @Autowired
    ManagerRepository managerrepository; //variable which allows storing managers into the repository

    //getAll() is a function to return the current managers
    public List<Manager> getAll(){
        return managerrepository.findAll();
    }

    //Dummy() calls the function from the ManagerRepository class to store dummy managers in the current repository
    public void Dummy(){
        managerrepository.Dummy();
    }

    //insert(Manager) stores a specific manager in the repository
    public Manager insert (Manager manager) throws Exception{
        if(manager.getId()<1){
            throw new Exception("Invalid ID");
        }
        managerrepository.findAll().add(manager);
        return manager;
    }

}
