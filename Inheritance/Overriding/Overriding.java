/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.overriding;

/**
 *
 * @author bintang
 */
public class Overriding {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        
        System.out.println(parent.toString());
        System.out.println(child.toString());
        System.out.println(child.toStringParent());
        
        child.methodChild();
        System.out.println("This is parent number = " + parent.number);
        parent.number = 40;
        System.out.println("This is parent number = " + parent.number);
        
        //System.out.println("Number accessed by child = " + child.getNumber());
    }
}
