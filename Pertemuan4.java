
package com.mycompany.belajarjavadasar;
import java.util.Scanner;

public class Pertemuan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahmhs;
         System.out.println("Masukkan Jumlah Mahasiswa : ");
         jumlahmhs =input.nextInt();
        int nim[] = new int[jumlahmhs];
        String nama[] = new String[jumlahmhs];
        
        for(int i=0; i<jumlahmhs; i++){
            System.out.println("Data Mahasiswa ke-" +(i+1));
            System.out.println("NIM : ");
            nim[i] = input.nextInt();
            
            System.out.println("Nama : ");
            nama[i] = input.next();
        }
    }
}


    
   