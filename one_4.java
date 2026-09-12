/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_1;

/**
 *
 * (Print a table) Write a program that displays the following table
 * @author Owner
 */
public class one_4 {
    
    public static void main(String[] args){
        
        char letter = 'a';
        System.out.printf("%c \t %c %s \t %c %s \t \n", letter, letter, "^2", letter, "^3" );
        
        for(int i = 1; i < 5; i++){
            
            System.out.printf("%d\t%f\t%f\n", i, Math.pow(i, 2), Math.pow(i, 3));
            
        }
        
    }
    
}
