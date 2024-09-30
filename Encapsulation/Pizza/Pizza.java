/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.pizzaencap;

/**
 *
 * @author bintang
 */
public class Pizza {
    private String name;
    private int topping;
    private String sauce;
    
    public int getTopping(String user) {
        if (user.equals("Andi")) {
            return topping;
        } else {
            return 999;
        }
    }
    
    public void setTopping(int howMany) {
        if (howMany < 3) {
            this.topping = howMany;
        }
    }
    
    public String getSauce() {
        return sauce;
    }
    
    public void setSauce(String pizzaSauce) {
        this.sauce = pizzaSauce;
    }
    
    public void setName(String pizzaName) {
        this.name = pizzaName;
    }
        
    public String getName() {
        return name;
    }
}
