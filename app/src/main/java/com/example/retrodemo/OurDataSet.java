package com.example.retrodemo;

public class OurDataSet {
    String name;
    String designation;

    public OurDataSet() {
    }

    public OurDataSet(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
