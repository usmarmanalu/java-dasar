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
//MENGHENTIKAN PERULANGAN SAAT INI DAN MELANJUTKAN KE PERULANGAN BERIKUTNYA//

public class Continue {
    public static void main(String[] args) {
        for (var counter =1; counter <=100; counter++){
            if (counter % 2 ==0){
                continue;
            }
            System.out.println("perulangan ganjil "+ counter);
        }
    }
}
