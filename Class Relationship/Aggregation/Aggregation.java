/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.aggregation;

/**
 *
 * @author bintang
 */
public class Aggregation {

    public static void main(String[] args) {
        Car honda = new Car("Honda S2000");

        Engine v1000 = new Engine("v1000");

        Transmission auto = new Transmission();
        auto.setType("Automatic");

        honda.addEngine(v1000);
        honda.addTransmission(auto);
        
        System.out.println(honda.getCarName() + " has a " + v1000.getEngineName() + " engine and " + auto.getType() + " transmission");
        
    }
}
