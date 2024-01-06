package com.example.crudemployee.model;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String dateOfBith;
    private String gender;
    private int phone;
    private String project;
    private String department;

    public Employee() {

    }

    public Employee(int id, String name, String email, String dateOfBith, String gender, int phone, String project, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBith = dateOfBith;
        this.gender = gender;
        this.phone = phone;
        this.project = project;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBith() {
        return dateOfBith;
    }

    public void setDateOfBith(String dateOfBith) {
        this.dateOfBith = dateOfBith;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
