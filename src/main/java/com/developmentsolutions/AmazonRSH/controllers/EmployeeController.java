package com.developmentsolutions.AmazonRSH.controllers;

import com.developmentsolutions.AmazonRSH.models.Employee;
import com.developmentsolutions.AmazonRSH.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    @Autowired
    EmployeeService employeeservice;

    @GetMapping("/all")
    public List<Employee> getAll() {return employeeservice.getAll();}

    @GetMapping("/insert") //adds dummy information
    public String insert(){
        employeeservice.loadEmployees();
        return "Information inserted!";
    }

    @PostMapping("/save") //saves a new agent
    public Employee save(@RequestBody Employee employee) throws Exception{
        employeeservice.insert(employee);
        return employee;
    }

}
