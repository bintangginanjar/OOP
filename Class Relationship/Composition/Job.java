/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.composition;

/**
 *
 * @author bintang
 */
public class Job {
    private String name;
    private double salary;
    
    public Job(String jobName, double jobSalary) {
        this.name = jobName;
        this.salary = jobSalary;
    }
    
    public String getJobName() {
        return name;
    }
    
    public double getJobSalary() {
        return salary;
    }
}
