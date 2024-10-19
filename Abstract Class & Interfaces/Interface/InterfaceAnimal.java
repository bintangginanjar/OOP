/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.interfaceanimal;

/**
 *
 * @author bintang
 */
public class InterfaceAnimal {

    public static void main(String[] args) {
        Whale whale = new Whale();
        Tiger tiger = new Tiger();
        Bat bat = new Bat();
        Eagle eagle = new Eagle();
        Ostrich ostrich = new Ostrich();
        Penguin penguin = new Penguin();
        
        //System.out.println(whale.whoAmI());
        //System.out.println(whale.dive());
        //System.out.println(tiger.whoAmI());
        System.out.println(bat.whoAmI());
        System.out.println(bat.canFly());
        System.out.println(bat.eatMeat());
        //System.out.println(eagle.whoAmI());
        //System.out.println(ostrich.whoAmI());
        //System.out.println(penguin.whoAmI());
        //System.out.println(penguin.eatMeat());
        
        //System.out.println(penguin.dive());
        
    }
}
