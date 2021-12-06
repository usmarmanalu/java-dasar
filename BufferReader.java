/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.belajarjavadasar;
import java.io.*;
/**
 *
 * @author manalu
 */
public class BufferReader {
    public static void main(String[] args) throws Exception {
        InputStreamReader keyreader = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader(keyreader);
        
        String kata1, kata2;
        
        System.out.println("masukkan kata pertama : ");
        kata1 = input.readLine();
        System.out.println("masukkan kata kedua : ");
        kata2 = input.readLine();
        System.out.println("\n hasil input string "+kata1+ " "+ kata2);
        
                
    }
}
