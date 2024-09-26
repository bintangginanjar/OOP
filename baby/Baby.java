/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.baby;

/**
 *
 * @author bintang
 */
public class Baby {

    String name;
    boolean isMale;
    double weight;
    double decibels;
    int numPoops = 0;
    
    public static void main(String[] args) {
        Baby myBaby = new Baby();
        myBaby.name = "Sarah";
        myBaby.isMale = false;
        myBaby.weight = 2.8;
        double decibels = 30.1;        
        myBaby.helloWorld();
        myBaby.poop();
        //System.out.println("Hello World!");
    }
    
    public void poop() {
        numPoops += 1;
        System.out.println("Dear mother, I have pooped. Prepare the diaper.");
    }
        
    public void helloWorld() {
        System.out.println("Hello world meet " + name);
        System.out.println("My weight is " + weight + " kilograms");        
    }
}
