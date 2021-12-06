/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.belajarjavadasar;
import java.util.Scanner;
/**
 *
 * @author manalu
 */
public class AksiScanner {
    public static void main(String[] args) {
        Pertemuan3 scan = new Pertemuan3();
        
        scan.InputScanner();
        System.out.println("nama anda : "+scan.getnama());
        System.out.println("nilai rata-rata anda : "+scan.HitungRata());
        
    }
}
