/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.interfaceanimal;

/**
 *
 * @author bintang
 */
public class Eagle extends Birds {
    @Override
    public String whoAmI() {
        return "I'am an eagle";
    }
    
    @Override
    public String move() {
        return "We move by flying";
    }
}
