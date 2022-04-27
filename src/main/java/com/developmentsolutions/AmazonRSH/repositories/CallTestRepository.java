package com.developmentsolutions.AmazonRSH.repositories;

import com.developmentsolutions.AmazonRSH.models.CallCompositeKey;
import com.developmentsolutions.AmazonRSH.models.CallTest;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface CallTestRepository extends
        CrudRepository<CallTest, CallCompositeKey>{
        }
