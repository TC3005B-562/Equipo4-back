package com.developmentsolutions.AmazonRSH.models;
import java.util.ArrayList;
import java.util.List;

public class Call {

    private int agent_id;
    private String call_reason;
    private String user_name;
    private List<String> video_settings;
    private String timestamp;
    private int duration;
    private List<String> tags;
    private String description;
    private List<String> permissions;
    private String video_reference;

    public Call() {
        this.agent_id = -1;
        this.call_reason = "";
        this.user_name = "";
        this.video_settings = new ArrayList<String>();
        this.timestamp = "";
        this.duration = -1;
        this.tags = new ArrayList<String>();
        this.description = "";
        this.permissions = new ArrayList<String>();
        this.video_reference = "";
    }

    public int getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(int agent_id) {
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

    public List<String> getVideo_settings() {
        return video_settings;
    }

    public void setVideo_settings(List<String> video_settings) {
        this.video_settings = video_settings;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public String getVideo_reference() {
        return video_reference;
    }

    public void setVideo_reference(String video_reference) {
        this.video_reference = video_reference;
    }
}
