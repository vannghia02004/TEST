/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bt3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Bt6 {

    public static void main(String[] args) {
        ArrayList<String> Ky = new ArrayList<>();
        Ky.add("Java");
        Ky.add("Python");
        Ky.add("C++");
        Ky.add("JavaScript");
          String Tu = "Python";
           if (Ky.contains(Tu)) {
            System.out.println(Tu+ " co trong ArrayList.");
        } else {
            System.out.println(Tu + " khong co trong ArrayList.");
        }
    }
}
