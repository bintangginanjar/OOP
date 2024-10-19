/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.upcasting;

/**
 *
 * @author bintang
 */
public class Upcasting {

    public static void main(String[] args) {
        Parent parent = new Parent();
        //Son son = new Son();
        Daughter daughter = new Daughter();
        GrandDaughter grandDaughter = new GrandDaughter();
        
        Parent castParent;   
        
        castParent = new Son();
        System.out.println(castParent.toString());
        System.out.println(castParent.number);
        /*
        castParent = grandDaughter;
        System.out.println(castParent.toString());
        System.out.println(castParent.number);               
        */
    }
}
