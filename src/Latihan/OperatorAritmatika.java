/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ASUS
 */
public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        
        int c;
        
        //penjumlahan
        c = a + b;
        System.out.println(a+"+"+b+"="+c);
        
        //kurang
        c = a - b;
        System.out.println(a+"-"+b+"="+c);
        
        //perkalian
        c = a * b;
        System.out.println(a+"x"+b+"="+c);
        
        //pembagian
        c = a / b;
        System.out.println(a+":"+b+"="+c);
        
        //sisa hasil bagi
        c = a % b;
        System.out.println(a+"%"+b+"="+c);
        
    }
}