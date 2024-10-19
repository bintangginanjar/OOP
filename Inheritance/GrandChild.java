/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.grandchild;

import com.oop.inheritance.*;

/**
 *
 * @author bintang
 */
public class GrandChild extends Parent{
    
    public void setVariable() {
        publicParentInt = 10;
        setPrivateParentInt(20);
        //defaultParentInt = 30;
        protectedParentInt = 40;
    }
            
}
