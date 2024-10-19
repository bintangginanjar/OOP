/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.inheritance;

import com.oop.grandchild.*;

/**
 *
 * @author bintang
 */
public class Inheritance {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        
        parent.methodParent();
        child.methodParent();
        
        child.methodChild();        
        //parent.methodChild();

        
        /*
        child.setChildVariable();
        System.out.println("private parent int = " + parent.getPrivateParentInt());
        System.out.println("private child int = " + child.getPrivateParentInt());
        */
        
        /*
        parent.setPrivateParentInt(30);
        System.out.println("private parent int = " + parent.getPrivateParentInt());       
        *
        /*
        child.setChildVariable();                
        System.out.println("privateParentInt = " + child.getPrivateParentInt());
        
        GrandChild grandChild = new GrandChild();
        grandChild.setVariable();        
        
        System.out.println("protectedParentInt = " + grandChild.protectedParentInt);
        */
    }
}
