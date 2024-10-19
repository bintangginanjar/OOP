/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.interfaceanimal;

import com.oop.interfaceanimal.IntAnimal;

/**
 *
 * @author bintang
 */
public class Tiger extends Mammal implements Runner {
    
    @Override
    public String whoAmI() {
        return "I'am a tiger";
    }
    
    @Override
    public String move() {
        return "We move by running";
    }
    
    @Override
    public String runFast() {
        return "We're running fast";
    }
}
