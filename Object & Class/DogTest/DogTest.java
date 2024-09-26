/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dogtest;

/**
 *
 * @author bintang
 */
public class DogTest {

    public static void main(String[] args) {
        Dog lassie = new Dog();
        lassie.size = 40;
        lassie.breed = "Husky";
        lassie.name = "Lassie";
        lassie.bark(lassie);
        lassie.poop();
        
        Dog hachiko = new Dog();
        hachiko.size = 40;
        hachiko.breed = "Alaskan Malimute";
        hachiko.name = "Hachiko";
        hachiko.bark(hachiko);
        hachiko.poop();
        //System.out.println("Hello World!");
    }
}
