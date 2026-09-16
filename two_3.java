/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;
import java.util.Scanner;
/**
 *
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 * @author Owner
 */
public class two_3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a value for feet: ");
        double feet = input.nextDouble();
        System.out.printf("%f%s%f%s", feet, " feet is ", .305 * feet, " meters");
        
    }
}
