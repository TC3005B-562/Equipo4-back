package com.developmentsolutions.AmazonRSH.services;

import com.developmentsolutions.AmazonRSH.models.CallTest;
import com.developmentsolutions.AmazonRSH.repositories.CallTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallTestService {

    @Autowired
    CallTestRepository calltestespository;

    public List<CallTest> findAll(){
        return calltestespository.findAll();
    }

}
