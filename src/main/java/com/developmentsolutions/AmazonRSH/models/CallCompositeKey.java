package com.developmentsolutions.AmazonRSH.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

public class CallCompositeKey {
    private Integer agent_id;
    private String call_reason;


    public CallCompositeKey(){}
    public CallCompositeKey(Integer agent_id, String call_reason) {
        this.agent_id = agent_id;
        this.call_reason = call_reason;
    }

    @DynamoDBHashKey(attributeName = "agent_id")
    public Integer getAgent_id() {
        return agent_id;
    }
    public void setAgent_id(Integer agent_id) {
        this.agent_id = agent_id;
    }

    @DynamoDBRangeKey(attributeName = "call_reason")
    public String getCall_reason() {
        return call_reason;
    }
    public void setCall_reason(String call_reason) {
        this.call_reason = call_reason;
    }
}
