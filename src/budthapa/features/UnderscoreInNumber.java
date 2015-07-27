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
public class UnderscoreInNumber {

    /**
     * Java 7 features
     * Now supports underscore between numbers to make it readable
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //under scores in number
        int number = 60_00;
        int number1 = 10_50;
        System.out.println("Sum of "+ number+" and "+ number1+" is "+ (number + number1));
    }

}
