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
public class AksiIf {
    public static void main(String[] args) {
        KondisiIf input = new KondisiIf();
        
        input.InputData();
        input.HitungGrade();
        
        System.out.println("------------------------");
        System.out.println("   Hitung Hasil Nilai");
        System.out.println("------------------------");
        System.out.println("NIM anda : "+input.nim);
        System.out.println("nama anda : "+input.nama);
        System.out.println("kelas anda : "+input.kelas);
        System.out.println("nilai akhir anda :"+input.rata);
        System.out.println("------------------------");
        System.out.println("keterangan : "+input.keterangan);
        System.out.println("grade anda : "+input.grade);
        System.out.println("------------------------");
    }
}
