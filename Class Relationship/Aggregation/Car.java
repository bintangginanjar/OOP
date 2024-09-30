/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.aggregation;

/**
 *
 * @author bintang
 */
public class Car {
    private String name;
    private Engine engine;
    private Transmission transmission;
    
    public Car(String name){
        this.name = name;
    }
    
    public String getCarName() {
        return this.name;
    }
    
    public void addEngine(Engine e){
        engine = e;
    }
    
    public void addTransmission(Transmission t){
        transmission = t;
    }
}
