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
public class KondisiIf {
    public String nama, nim, kelas, grade,keterangan;
    public int n1,n2,n3;
    public double rata;
    
    Scanner input = new Scanner(System.in);
    public void InputData(){
        System.out.println("silahkan masukkan NIM anda : ");
        nim = input.nextLine();
        System.out.println("silahkan masukkan nama anda : ");
        nama = input.nextLine();
        System.out.println("silahkan masukkan kelas anda : ");
        kelas = input.nextLine();
        System.out.println("silahkan masukkan nilai ke-1 : ");
        n1 = input.nextInt();
        System.out.println("silahkan masukkan nilai ke-2 : ");
        n2 = input.nextInt();
        System.out.println("silahkan masukkan nilai ke-3 : ");
        n3 = input.nextInt();
        
        rata = ((n1+n2+n3)/3);
        
    }
    
    public String HitungGrade(){
        if (rata >=80) {
           grade = "A";
           keterangan = "Lulus";
        }else if (rata >=70) {
            grade = "B";
            keterangan = "Lulus";
        }else if (rata>=60) {
            grade = "C";
            keterangan = "Lulus";
        }else if (rata >=59) {
            grade = "D";
            keterangan = "anda tidak lulus";
        }else{
            grade = "E";
            keterangan = "anda tidak lulus";
            }
        return grade;
        
        }
        
    }

