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
public class Bt9 {
    public static void main(String[] args) {
         ArrayList<Integer> So = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            So.add(i);
        }

        Integer[] Test = new Integer[So.size()];
        So.toArray(Test);
          System.out.println("Sau khi doi:");
        for (int so : Test) {
            System.out.println(so);
        }
    }
}
