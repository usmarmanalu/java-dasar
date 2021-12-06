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
public class MethodParameter {
    public static void main(String[] args) {
        sayHello("usmar", "manalu");
    }
    
    static void sayHello(String firsname, String lastname){
        System.out.println("Hello " + firsname+" "+lastname);
    }
}
