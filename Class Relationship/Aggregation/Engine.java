/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.aggregation;

/**
 *
 * @author bintang
 */
public class Engine {
    private String name;
    private int horsePower;

    public Engine(String name) {
        this.name = name;
    }        

    public String getEngineName() {
        return name;
    }
    
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int hp) {
        this.horsePower = hp;
    }
}
