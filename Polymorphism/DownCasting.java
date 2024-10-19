/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.downcasting;

/**
 *
 * @author bintang
 */
public class DownCasting {

    public static void main(String[] args) {
        Parent castParent;
                        
        castParent = new GrandDaughter();
        //System.out.println(castParent.toString());
        //System.out.println(castParent.methodSon());
        
        GrandDaughter castGrandDaughter = (GrandDaughter) castParent;
        /*
        System.out.println(castGrandDaughter.toString());
        System.out.println(castGrandDaughter.methodDaughter());
        System.out.println(castGrandDaughter.methodGrand());
        */
        
        Parent castFather = new Son();
        castFather.name = "Benny";
        Son castSon = (Son) castFather;
        
        System.out.println(castSon.name);
        System.out.println(castSon.methodSon());
        System.out.println(castSon.methodParent());
        
        System.out.println("Son instance of Parent = " + (castSon instanceof Parent));
        System.out.println("Grand daughter instance of Parent = " + (castGrandDaughter instanceof Parent));
        
    }
}
