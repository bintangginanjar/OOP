/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.dogconstruct;

/**
 *
 * @author bintang
 */
public class Dog {
    private int size;
    private String breed;
    private String name;
    private String food;
    
    public Dog(int dogSize, String dogBreed, String dogName) {
        this.size = dogSize;
        this.breed = dogBreed;
        this.name = dogName;        
    }
    
    public int getSize() {
        return this.size;
    }
    
    public String getBreed() {
        return this.breed;
    }
    
        
    public String getName() {
        return this.name;
    }
    
    public String getFood() {
        return this.food;
    }
    
    public void setName(String dogName) {
        this.name = dogName;
    }
    
    public void feed(String catFood) {
        this.food = catFood;
    }
    
    /*
    public void setSize(int dogSize) {
        this.size = dogSize;
    }
            
    public void setBreed(String dogBreed) {
        this.breed = dogBreed;
    }
    
    public void bark(Dog d) {
        System.out.println(d.name + " Bark woof, woof!");
    }
    
    public void poop() {
        System.out.println("Dear babu, I've pooped");
    }
    */
}
