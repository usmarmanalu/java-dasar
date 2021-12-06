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
//MENGHENTIKAN SEMUA PERULANGAN//

public class Break {
    public static void main(String[] args) {
        var counter =1;
        
        while (true) {
            System.out.println("perulangan "+counter);
            counter++;
            
            if(counter >10){
                break;
            }
        }
    }
}
