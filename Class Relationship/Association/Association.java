/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.association;

/**
 *
 * @author bintang
 */
public class Association {

    public static void main(String[] args) {
        Student std = new Student(("Dedi"));
        Instructor inst = new Instructor("Enjang");
        
        inst.giveAssignment(std, "Object Oriented Programming");
        System.out.println(std.getName() + " assigned " + std.getAssignment());
        //System.out.println("Hello World!");
    }
}
