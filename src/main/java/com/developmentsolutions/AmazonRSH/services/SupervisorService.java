package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.models.Supervisor;
import com.developmentsolutions.AmazonRSH.repositories.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SupervisorService {

    @Autowired
    SupervisorRepository supervisorrepository;

    public List<Supervisor> getAll(){
        return supervisorrepository.findAll();
    }

    public void Dummy(){
        supervisorrepository.Dummy();
    }

    public Supervisor insertar (Supervisor supervisor) throws Exception{
        if(supervisor.getId()<1){
            throw new Exception("Invalid ID");
        }
        supervisorrepository.findAll().add(supervisor);
        return supervisor;
    }

}
