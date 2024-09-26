/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dogtest;

/**
 *
 * @author bintang
 */
public class Dog {
    int size;
    String breed;
    String name;
    
    void bark(Dog d) {
        System.out.println(d.name + " Bark woof, woof!");
    }
    
    void poop() {
        System.out.println("Dear babu, I've pooped");
    }
}
