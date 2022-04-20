package com.developmentsolutions.AmazonRSH.controllers;

import com.developmentsolutions.AmazonRSH.models.CallTest;
import com.developmentsolutions.AmazonRSH.services.CallTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calltest")

public class CallTestController {

    @Autowired
    CallTestService ctService;
    @GetMapping("/all")
    public List<CallTest> getAllCalls(){
        return ctService.findAll();
    }

}
