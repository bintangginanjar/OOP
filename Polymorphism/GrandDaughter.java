/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.upcasting;

/**
 *
 * @author bintang
 */
public class GrandDaughter extends Daughter{
    protected int number = 40;
    
    @Override
    public String toString(){ 
	return "Grand daughter number = " + number;  
    } 	

    public String methodGrand(){ 
	return "method grand daughters"; 
    }
}
