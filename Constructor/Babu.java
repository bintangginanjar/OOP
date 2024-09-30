/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.dogconstruct;

/**
 *
 * @author bintang
 */
public class Babu {
    private String name;
    
    public Babu(String name) {
        this.name = name;
    }
    
    public void feeding(Dog d, String catFood) {
        d.feed(catFood);
    }
    
    public String getName() {
        return name;
    }
}
