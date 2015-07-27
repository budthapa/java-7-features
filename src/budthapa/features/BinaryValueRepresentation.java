/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.budthapa;

/**
 *
 * @author Buddhi Bal Thapa, budthapa@gmail.com
 */
public class BinaryValueRepresentation {
    
    /**
     * Java 7 has feature to represent binary number by putting '0b' before sequence number
     * @param args 
     */
    public static void main(String []args){
        int x=0b0110;
        System.out.println("Binary value "+x); //this will print 6
        int bNum=0b1101;
System.out.println("Decimal representation of : "+bNum);
    }
}
