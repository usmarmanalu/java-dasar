/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author manalu
 */
public class Array {
    public static void main(String[] args) {
        String[] stringarray;
        stringarray = new String[3];
        
        stringarray[0] = "usmar";
        stringarray[1] = "manalu";
        stringarray[2] = "belajar java";
        
        System.out.println(stringarray[0]);
        System.out.println(stringarray[1]);
        System.out.println(stringarray[2]);
        
        
        //Array Initializer
        String[] namaNama ={
            "usmar", "manalu","belajar java"
        };
        
        //mengubah data array menjadi null
        namaNama[0] = null;
        
        int[] arrayint = new int[]{
            1,2,3,4,5,6,7
        };
        
        long[] arraylong ={
            10L, 20L,30L
        };
        //mengubah data diarray menjadi 0
        arraylong[0] =0;
        
        //Operasi Array
        //array[index] yaitu mengambil data di array
        //array[index] = value yaitu mengubah data di array
        //array.length yaitu mengambil panjang array
        
        System.out.println(arraylong.length);
        
        //membuat array didalam array
        String[][] member ={
            {"usmar", "manalu"},
            {"belajar", "java"},
            {"proramer zaman now"}
        };
        
        System.out.println(member[0][0]);
        System.out.println(member[1][1]);
        System.out.println(member[2][0]);
        
    }
}
