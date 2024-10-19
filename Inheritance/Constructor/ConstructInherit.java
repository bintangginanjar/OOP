/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.contructinherit;

/**
 *
 * @author bintang
 */
public class ContructInherit {

    public static void main(String[] args) {
        Parent parent = new Parent(20);
        Child child = new Child(10, 2.5);
        
        System.out.println("Parent int instanced by parent = " + parent.parentInt);
        System.out.println("Child int instanced by child = " + child.getChildInt());
        System.out.println("Parent int instanced by child = " + child.parentInt);
        System.out.println("Parent double instanced by child = " + child.parentDouble);
    }
}
