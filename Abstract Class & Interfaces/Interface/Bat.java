/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.interfaceanimal;

/**
 *
 * @author bintang
 */
public class Bat extends Mammal implements CanFly, Carnivorous {
    
    @Override
    public String whoAmI() {
        return "I'am a bat";
    }
    
    @Override
    public String move() {
        return "We move by flying";
    }
    
    @Override
    public String canFly() {
        return "We are low flying";
    }
    
    @Override
    public String eatMeat() {
        return "We're eating little bug";
    }
}
