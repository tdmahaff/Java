/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;
import java.util.Scanner;
/**
 *
 * (Sum the digits in an integer) Write a program that reads an integer between 0
and 1000 and adds all the digits in the integer. For example, if an integer is 932,
the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
Here is a sample run:
 * @author Owner
 * 
 */
public class two_6 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number between 0 and 1000: ");
        int num1 = input.nextInt();
        while(num1 < 0 || num1 > 1000){
            System.out.printf("Enter a number between 0 and 1000: ");
            num1 = input.nextInt();
        }
        
        int sum = 0;
        
        while(num1 % 10 > 0){
            
            sum += num1 % 10;
            num1 /= 10;
            
        }
        
        System.out.printf("The sum of the digits is %d", sum);
        
    }
    
}
