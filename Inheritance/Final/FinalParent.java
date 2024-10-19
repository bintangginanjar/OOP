/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.finalparent;

/**
 *
 * @author bintang
 */
public class FinalParent {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        
        System.out.println(child.parentMethod());
        System.out.println(child.myMethod());
        
        final Parent finalParentOne = new Parent();
        final Parent finalParentTwo;
        
        finalParentTwo = parent;
        
        //finalParentOne = parent;
        //finalParentTwo = new Parent();
        
        //finalParentTwo.setNumber(20);
        //System.out.println(finalParentTwo.getNumber());
    }
}
