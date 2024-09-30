/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oop.composition;

/**
 *
 * @author bintang
 */
public class Composition {

    public static void main(String[] args) {
        Employee emp = new Employee("Lucas", "Analyst", 100000000, "Business Development");
        System.out.println(emp.getEmployeeName() + " work as a " + emp.getJob() + " on " + emp.getDepartment() + " department and has a salary worth " + emp.getSalary());
    }
}
