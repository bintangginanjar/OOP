/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.composition;

/**
 *
 * @author bintang
 */
public class Employee {
    private String name;
    private Job job;
    private Department department;
    
    public Employee(String employeeName, String jobName, double jobSalary, String departmentName) {
        this.name = employeeName;
        this.job = new Job(jobName, jobSalary);
        this.department = new Department(departmentName);                
    }
    
    public String getEmployeeName() {
        return name;
    }
    
    public double getSalary() {
        return job.getJobSalary();
    }
    
    public String getJob() {
        return job.getJobName();
    }
    
    public String getDepartment() {
        return department.getDepartmentName();
    }
}
