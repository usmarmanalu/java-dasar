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
public class ForEach {
    public static void main(String[] args) {
        String[] names = {
            "usmar", "manalu", "belajar",
            "java", "programmer", "zaman now"
        };
        
        for(var i =0; i <names.length; i++){
            System.out.println(names[i]);
        }
        
        
        //kode singkat dari kode diatas//
        for (var name: names){
            System.out.println(name);
        }
    }
}
