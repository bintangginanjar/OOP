/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.upcasting;

/**
 *
 * @author bintang
 */
public class Son extends Parent {
    protected int number = 30;
	
    @Override
    public String toString(){ 
	return "Son number = " + number;  
    } 	

    public String methodSon(){ 
	return "method sons"; 
    }
}
