package com.developmentsolutions.AmazonRSH.models;

public class Agent {
    private int id;
    private int supervisor_id;
    private String asosiation;
    private String username;
    private String password;

    public Agent() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSupervisor_id() {
        return supervisor_id;
    }

    public void setSupervisor_id(int supervisor_id) {
        this.supervisor_id = supervisor_id;
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
