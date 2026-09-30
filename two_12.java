/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;
import java.util.Scanner;
/**
 *
 * 
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off 
speed v, you can compute the minimum runway length needed for an airplane to 
take off using the following formula:
length = v2
2a
Write a program that prompts the user to enter v in meters/second (m/s) and 
the acceleration a in meters/second squared (m/s2), then, displays the minimum 
runway length
 * @author Owner
 */
public class two_12 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter speed and acceleration: ");
        
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        
        double length = Math.pow(speed, 2) / (2 * acceleration);
        
        System.out.printf("The minimum runway length for this airplane is %f", length);
        
    }
}
