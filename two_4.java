/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;
import java.util.Scanner;
/**
 *
 * Convert pounds into kilograms) Write a program that converts pounds into ki-
lograms. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilogram. Here is a
sample run:
 * @author Owner
 */
public class two_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        
        System.out.printf("%f%s%f%s", pounds, " pounds is ", pounds *.454, " kilograms");
    }
}
