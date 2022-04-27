package com.developmentsolutions.AmazonRSH.DTO;

import java.util.Set;

public class CallDTO {
    private Integer agent_id;
    private String call_reason;
    private String user_name;
    private Set<String> video_settings;
    private String timestamp;
    private Integer duration;
    private Set<String> tags;
    private String description;
    private Set<Integer> permissions;
    private String video_reference;

    public Integer getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(Integer agent_id) {
        this.agent_id = agent_id;
    }

    public String getCall_reason() {
        return call_reason;
    }

    public void setCall_reason(String call_reason) {
        this.call_reason = call_reason;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Set<String> getVideo_settings() {
        return video_settings;
    }

    public void setVideo_settings(Set<String> video_settings) {
        this.video_settings = video_settings;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Integer> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Integer> permissions) {
        this.permissions = permissions;
    }

    public String getVideo_reference() {
        return video_reference;
    }

    public void setVideo_reference(String video_reference) {
        this.video_reference = video_reference;
    }
}
