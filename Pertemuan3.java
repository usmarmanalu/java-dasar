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
public class Pertemuan3 {
    String nama;
    public double n1;
    public int n2,n3;
    
    public String getnama(){
        return nama;
        
    }
    Scanner Input = new Scanner(System.in);
    public void InputScanner(){
        System.out.println("masukkan nama anda : ");
        nama = Input.nextLine();
        System.out.println("masukkan nilai ke-1 : ");
        n1 = Input.nextInt();
        System.out.println("masukkan nilai ke-2 : ");
        n2 = Input.nextInt();
        
    }
    public double HitungRata(){
        return ((n1+n2)/2);
    }
}
