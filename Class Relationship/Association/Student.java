/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.association;

/**
 *
 * @author bintang
 */
public class Student {
    private String name;
    private String assignment;
	
    public Student(String name){
        this.name = name;
    }		

    public void setName(String name){
        this.name = name;
    }	

    public String getName(){
        return name;
    }

    public void setAssignment(String assignment){
        this.assignment = assignment;
    }
	
    public String getAssignment(){
        return assignment;
    }
}
