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
public class IfStatement {
    public static void main(String[] args) {
        
    var nilai =45;
    var absen = 45;
    
    if (nilai >=75 && absen >=75){
        System.out.println("selamat anda lulus");
    } else {
        System.out.println("silahkan coba lagi tahun depan");
    }
    
    
    if (nilai >=80 && absen >=80){
        System.out.println("nilai anda A");
    } else if (nilai >=70 && absen >=70) {
        System.out.println("nilai anda B");
    } else if (nilai >=60 && absen >=60) {
        System.out.println("nilai anda C");
    }else if (nilai >=50 && absen >=50) {
        System.out.println("nilai anda D");
    } else {
        System.out.println("Nilai anda E");    
        }
    }
}
