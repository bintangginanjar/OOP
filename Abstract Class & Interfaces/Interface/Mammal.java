/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.interfaceanimal;

/**
 *
 * @author bintang
 */
public class Mammal extends Animal {
    protected String furHair;
    protected String mamaryGland;
    
    @Override
    public String whoAmI() {
        return "This is kingdom mammal";
    }
    
    @Override
    public String move() {
        return "We have various move";
    }
}
