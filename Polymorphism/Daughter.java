/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.upcasting;

/**
 *
 * @author bintang
 */
public class Daughter extends Parent{
    protected int number = 20;
	
    @Override
    public String toString(){ 
        return "Daughter number = " + number; 
    } 	

    public String methodDaughter(){ 
	return "method daughter"; 
    }
}
