package com.developmentsolutions.AmazonRSH.models;
import java.util.ArrayList;
import java.util.List;


public class Employee {

    private String role;
    private int employee_num;
    private String name;
    private String mail;
    private String password;
    private int num_calls;
    private int unsuccessful_tickets;
    private int successful_tickets;
    private List<String> agents;
    private String validity_timestamp;
    private List<String> video_time_limit;
    private int video_weight;

    public Employee() {
        this.role = "";
        int employee_num = -1;
        this.name = "";
        this.mail = "";
        this.password = "";
        this.num_calls = -1;
        this.unsuccessful_tickets = -1;
        this.successful_tickets = -1;
        this.agents = new ArrayList<String>();
        this.validity_timestamp = "";
        this.video_time_limit = new ArrayList<String>();
        this.video_weight = -1;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEmployee_num() {
        return employee_num;
    }

    public void setEmployee_num(int employee_num) {
        this.employee_num = employee_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNum_calls() {
        return num_calls;
    }

    public void setNum_calls(int num_calls) {
        this.num_calls = num_calls;
    }

    public int getUnsuccessful_tickets() {
        return unsuccessful_tickets;
    }

    public void setUnsuccessful_tickets(int unsuccessful_tickets) {
        this.unsuccessful_tickets = unsuccessful_tickets;
    }

    public int getSuccessful_tickets() {
        return successful_tickets;
    }

    public void setSuccessful_tickets(int successful_tickets) {
        this.successful_tickets = successful_tickets;
    }

    public List<String> getAgents() {
        return agents;
    }

    public void setAgents(List<String> agents) {
        this.agents = agents;
    }

    public String getValidity_timestamp() {
        return validity_timestamp;
    }

    public void setValidity_timestamp(String validity_timestamp) {
        this.validity_timestamp = validity_timestamp;
    }

    public List<String> getVideo_time_limit() {
        return video_time_limit;
    }

    public void setVideo_time_limit(List<String> video_time_limit) {
        this.video_time_limit = video_time_limit;
    }

    public int getVideo_weight() {
        return video_weight;
    }

    public void setVideo_weight(int video_weight) {
        this.video_weight = video_weight;
    }
}
