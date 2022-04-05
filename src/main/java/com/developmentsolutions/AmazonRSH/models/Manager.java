package com.developmentsolutions.AmazonRSH.models;

public class Manager {
    private int id;
    private String enterprise; // each company is registered by a manager, this attribute is the name of the company
    private String username;
    private String password;

    public Manager() {

    }

    //Getter and setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter and setter for the enterprise
    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
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
