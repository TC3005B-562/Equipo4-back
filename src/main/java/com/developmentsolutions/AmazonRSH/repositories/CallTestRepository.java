package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.CallTest;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableScan

public interface CallTestRepository extends CrudRepository<CallTest,String>{
    List<CallTest> findAll();
}
