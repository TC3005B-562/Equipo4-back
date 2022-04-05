package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.models.Supervisor;
import com.developmentsolutions.AmazonRSH.repositories.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SupervisorService {

    @Autowired
    SupervisorRepository supervisorrepository; //variable which allows storing supervisors into the repository

    //getAll() is a function to return the current supervisors
    public List<Supervisor> getAll(){
        return supervisorrepository.findAll();
    }

    //Dummy() calls the function from the SupervisorRepository class to store dummy supervisors in the current repository
    public void Dummy(){
        supervisorrepository.Dummy();
    }

    //insert(Manager) stores a specific supervisor in the repository
    public Supervisor insert (Supervisor supervisor) throws Exception{
        if(supervisor.getId()<1){
            throw new Exception("Invalid ID");
        }
        supervisorrepository.findAll().add(supervisor);
        return supervisor;
    }

}
