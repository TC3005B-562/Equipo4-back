package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.Agent;
import com.developmentsolutions.AmazonRSH.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> findAll(){
        return this.employees;
    }


}
