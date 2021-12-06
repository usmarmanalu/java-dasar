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
public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";
        
        
        switch(nilai){
            case "A":
                 
                System.out.println("woww..anda lulus dengan baik");
                break;
            case "B":
            case "C": 
                System.out.println("nilai anda cukup baik");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
                        
        }
        //Switch Lamda 
        /*hanya ada di java 14 keatas*/
        
        
        switch(nilai) {
            case "A" -> System.out.println("woww..anda lulus dengan baik");
            case "B","C" -> System.out.println("nilai anda cukup baik");
            case "D" -> System.out.println("anda tidak lulus");
            default -> {
                System.out.println("mungkin anda salah jurusan");
            }
            
            
        }
        
        //Switch dengan kata kunci yield//
        String ucapan;
        switch(nilai) {
            case "A" -> ucapan = "wow anda lulus dengan baik";
            case "B","C" -> ucapan = "nilai anda cukup baik";
            case "D" -> ucapan = "anda tidak lulus";
            default -> {
                ucapan = "mungkin anda salah jurusan";
           }
            
        }
        System.out.println(ucapan);
        
        ucapan = switch(nilai) {
            case "A":
                yield "woww anda lulus dengan baik";
            case "B","C":
                yield "nilai anda cukup baik";
            case "D":
                yield "anda tidak lulus";
            default:
                yield "mungkin anda salah jurusan";    
        };
        System.out.println(ucapan);
        }
}
