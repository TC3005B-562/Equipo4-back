package com.developmentsolutions.AmazonRSH.services;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.developmentsolutions.AmazonRSH.awsCode.CallAmazonDynamoDBScanGeneratedCode;
import com.developmentsolutions.AmazonRSH.models.Call;
import com.developmentsolutions.AmazonRSH.repositories.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CallService {

    @Autowired
    CallRepository callrepository;
    CallAmazonDynamoDBScanGeneratedCode caws;


    public List<Call> getAll(){
        return callrepository.findAll();
    }

    public void loadCalls(){
        List<Call> calls = caws.LoadCalls();

        for (Call item: caws.LoadCalls()){
            callrepository.findAll().add(item);
        }

    }

    public Call insert (Call call) throws Exception{
        if(call.getAgent_id()<1){
            throw new Exception("Invalid ID");
        }
        callrepository.findAll().add(call);
        return call;
    }



}
