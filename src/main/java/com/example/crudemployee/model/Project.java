package com.example.crudemployee.model;

public class Project {
    private int id;
    private String name;
    private String describe;
    private String startDay;
    private String endDate;

    public Project() {

    }

    public Project(int id, String name, String describe, String startDay, String endDate) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.startDay = startDay;
        this.endDate = endDate;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
