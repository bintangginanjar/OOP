/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.pizzaencap;

/**
 *
 * @author bintang
 */
public class PizzaEncap {

    public static void main(String[] args) {
        System.out.println("I wanna order pizza");
        
        Pizza pepperoni = new Pizza();
        pepperoni.setName("Pepperoni Pizza");
        pepperoni.setTopping(2);
        System.out.println("Topping on " + pepperoni.getName() + " is " + pepperoni.getTopping("Andi"));
        
        Pizza quartza = new Pizza();
        quartza.setName("Quartza Pizza");
        quartza.setTopping(3);
        System.out.println("Topping on " + quartza.getName() + " is " + quartza.getTopping("Lucas"));
    }
}
