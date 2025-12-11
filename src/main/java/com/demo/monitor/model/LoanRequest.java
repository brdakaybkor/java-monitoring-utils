package com.demo.eligibility.model;

public class LoanRequest {
    private double salary;
    private double liabilities;
    private int age;
    private int existingLoans;

    // getters & setters
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public double getLiabilities() { return liabilities; }
    public void setLiabilities(double liabilities) { this.liabilities = liabilities; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getExistingLoans() { return existingLoans; }
    public void setExistingLoans(int existingLoans) { this.existingLoans = existingLoans; }
}
