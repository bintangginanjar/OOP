/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.interfaceanimal;

/**
 *
 * @author bintang
 */
public abstract class Animal {
    protected int weight;
    protected int height;
    
    public abstract String whoAmI();
    
    public abstract String move();
}

interface Aquatic {
    public String swim();
    
    public String dive();
}

interface Carnivorous {
    public String eatMeat();
}

interface CanFly {
    public String canFly();
}