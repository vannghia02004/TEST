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
public class Bt4 {
    public static void main(String[] args) {
        ArrayList<Integer> So = new ArrayList<>();
        for(int  i = 1; i <=10; i++){
            So.add(i);
    }
            So.remove(Integer.valueOf(5));
            System.out.println("Sau khi xoa " +So );
    }
}
