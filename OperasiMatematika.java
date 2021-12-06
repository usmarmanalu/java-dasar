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
public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 150;
        int b = 25;
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        
        //augemented assigment
        int c =100;
        
        c += 10;
        System.out.println(c);
        
        c -= 10;
        System.out.println(c);
        
        c *= 10;
        System.out.println(c);
        
        //Unary Operator
        int d =100;
        d++;
        System.out.println(d);
        
        d--;
        System.out.println(d);
        
        System.out.println(!false);
        
    }
}
