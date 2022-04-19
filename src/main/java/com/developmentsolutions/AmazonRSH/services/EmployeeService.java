package com.developmentsolutions.AmazonRSH.services;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.developmentsolutions.AmazonRSH.awsCode.EmployeeAmazonDynamoDBScanGeneratedCode;
import com.developmentsolutions.AmazonRSH.models.Employee;
import com.developmentsolutions.AmazonRSH.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {

    @Autowired
    EmployeeRepository employeerepository;
    EmployeeAmazonDynamoDBScanGeneratedCode eaws;

    public List<Employee> getAll(){
        return employeerepository.findAll();
    }

    public void loadEmployees(){
        List<Employee> employees = eaws.LoadEmployees();

        for (Employee item: eaws.LoadEmployees()){
            employeerepository.findAll().add(item);
        }

    }

    public Employee insert (Employee employee) throws Exception{
        if(employee.getEmployee_num()<1){
            throw new Exception("Invalid ID");
        }
        employeerepository.findAll().add(employee);
        return employee;
    }



}
