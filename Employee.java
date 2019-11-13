package com.example.csc250_fall2019_employeemanager;

public class Employee
{
    private String fname;
    private String lname;
    private int height_feet;
    private int height_inches;
    private int age;
    private double weight;

    public Employee(String fname, String lname, int height_feet, int height_inches, int age, double weight)
    {
        this.fname = fname;
        this.lname = lname;
        this.height_feet = height_feet;
        this.height_inches = height_inches;
        this.age = age;
        this.weight = weight;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getHeight_feet() {
        return height_feet;
    }

    public int getHeight_inches() {
        return height_inches;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
