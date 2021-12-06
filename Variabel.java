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
public class Variabel {
    public static void main(String[] args) {
        String name;
        name = "Usmar Manalu";
        int age =30;
        String addrest = "indonesia";
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(addrest);
        
        name = "Programmer zaman now";
        System.out.println(name);
        
        //deklarasi tipe data dengan kunci var (value harus dimasukan langsung)
        var firname = "usmar";
        var lastname = "manalu";
        
        //konstan value string  tidak bisa diubah
        final String app = "belajar java";
       
    }
}
