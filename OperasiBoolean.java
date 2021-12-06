/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.belajarjavadasar;
//hghggjhgjygjhghh//

/**
 *
 * @author manalu
 */
public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 75;
        var nilaiakhir = 80;
        
        boolean lulusabsen = absen>=75;
        boolean lulusnilai = nilaiakhir >=75;
        
        var lulus = lulusabsen && lulusnilai;
        System.out.println(lulus);
    }
}
