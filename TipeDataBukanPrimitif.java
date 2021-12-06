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
public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniinteger = 100;
        Long inilong = 10000L;
        
        Byte inibyte = null;
        System.out.println(inibyte);
        
        inibyte =100;
        System.out.println(inibyte);
        
        //konversi ke tipe data primitiv
        int iniint = 100;
        Integer iniobjek = iniint;
        
        short inishort = iniobjek.shortValue();
        long inilong2 = iniobjek.longValue();
        float inifloat = iniobjek.floatValue();
    }
}
