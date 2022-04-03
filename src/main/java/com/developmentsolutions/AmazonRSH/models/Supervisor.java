package com.developmentsolutions.AmazonRSH.models;

public class Supervisor {
    private int id;
    private int manager_id;
    private String asosiation;
    private String username;
    private String password;

    public Supervisor() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getAsosiation() {
        return asosiation;
    }

    public void setAsosiation(String asosiation) {
        this.asosiation = asosiation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
