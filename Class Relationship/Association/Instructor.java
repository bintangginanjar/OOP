/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.association;

/**
 *
 * @author bintang
 */
public class Instructor {
    private String name;
	
    public Instructor(String name){
        this.name = name;
    }	

    public void giveAssignment(Student s, String assignment){
        s.setAssignment(assignment);
    }
}
