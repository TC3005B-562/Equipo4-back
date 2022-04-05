package com.developmentsolutions.AmazonRSH.models;

public class Agent {
    private int id;
    private int supervisor_id; //this is a foreign key from the supervisor model (will be eliminated since a NoSQL db will be used)
    private String association; //enterprise where the agent belongs to
    private String username;
    private String password;

    //Agent Constructor
    public Agent() {

    }

    //Getter and setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter and setter for supervisor_id
    public int getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(int supervisor_id) {
        this.supervisor_id = supervisor_id;
    }

    //Getter and setter for association
    public String getAssociation() {
        return association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    //Getter and setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //Getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
