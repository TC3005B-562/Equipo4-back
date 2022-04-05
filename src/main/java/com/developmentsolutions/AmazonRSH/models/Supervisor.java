package com.developmentsolutions.AmazonRSH.models;

public class Supervisor {
    private int id;
    private int manager_id;//this is a foreign key from the supervisor model (will be eliminated since a NoSQL db will be used)
    private String association; //enterprise where the supervisor belongs to
    private String username;
    private String password;

    public Supervisor() {

    }

    //Getter and setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter and setter for manager_id
    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    //Getter and setter for the association attribute
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
