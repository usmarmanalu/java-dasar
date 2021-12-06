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
public class SwitchCase {
    public static void main(String[] args) {
        String NamaBarang;
        int KodeBarang;
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Masukkan Kode Barang [1] [2] [3]");
        KodeBarang = input.nextInt();
        
        switch(KodeBarang){
            case 1:
            NamaBarang = "Alat Electronic";
            break;
            
            case 2:
            NamaBarang = "Alat Accesories";
            break;
            
            case 3:
            NamaBarang = "Alat Perkakas";
            break;
            
            default:
            NamaBarang = "Barang Tidak Tersedia";
            break;
            
        }
        System.out.println("Barang yang anda pilih : "+NamaBarang);
    }
}
