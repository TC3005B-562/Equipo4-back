package com.developmentsolutions.AmazonRSH.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Set;

@DynamoDBTable(tableName = "Call")
public class CallTest {

    private String user_name;
    private Set<String> video_settings;
    private String timestamp;
    private Integer duration;
    private Set<String> tags;
    private String description;
    private Set<Integer> permissions;
    private String video_reference;

    @Id
    private CallCompositeKey callCompositeKey;

    @DynamoDBHashKey(attributeName = "agent_id")
    public Integer getAgent_id() {
        return callCompositeKey != null ? callCompositeKey.getAgent_id() : null;
    }
    public void setAgent_id(Integer agent_id) {
        if (callCompositeKey == null) {
            callCompositeKey = new CallCompositeKey();
        }
        callCompositeKey.setAgent_id(agent_id);
    }

    @DynamoDBRangeKey(attributeName = "call_reason")
    public String getCall_reason() {
        return callCompositeKey != null ? callCompositeKey.getCall_reason() : null;
    }
    public void setCall_reason(String call_reason) {
        if (callCompositeKey == null) {
            callCompositeKey = new CallCompositeKey();
        }
        callCompositeKey.setCall_reason(call_reason);
    }


    @DynamoDBAttribute(attributeName = "user_name")
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @DynamoDBAttribute(attributeName = "video_settings")
    public Set<String> getVideo_settings() {
        return video_settings;
    }
    public void setVideo_settings(Set<String> video_settings) {
        this.video_settings = video_settings;
    }

    @DynamoDBAttribute(attributeName = "timestamp")
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @DynamoDBAttribute(attributeName = "duration")
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @DynamoDBAttribute(attributeName = "tags")
    public Set<String> getTags() {
        return tags;
    }
    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @DynamoDBAttribute(attributeName = "permissions")
    public Set<Integer> getPermissions() {
        return permissions;
    }
    public void setPermissions(Set<Integer> permissions) {
        this.permissions = permissions;
    }

    @DynamoDBAttribute(attributeName = "video_reference")
    public String getVideo_reference() {
        return video_reference;
    }
    public void setVideo_reference(String video_reference) {
        this.video_reference = video_reference;
    }

}
