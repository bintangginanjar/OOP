/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.dogconstruct;

/**
 *
 * @author bintang
 */
public class DogConstruct {

    public static void main(String[] args) {
        Dog lassie = new Dog(35, "German Sheperd", "Lassie");
        System.out.println("Hello world, meet " + lassie.getName() + " a " + lassie.getBreed() + " dog");
        
        Dog hachiko = new Dog(40, "Alaskan Malimute", "Hachiko");
        System.out.println("Hello world, meet " + hachiko.getName() + " a " + hachiko.getBreed() + " dog");
        
        Babu babu = new Babu("Baabu");
        babu.feeding(lassie, "Royal Canin");
        System.out.println(babu.getName() + " feeding " + lassie.getName());
    }
}
