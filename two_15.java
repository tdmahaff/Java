/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;
import java.util.Scanner;
/**
 *
 * (Geometry: distance of two points) Write a program that prompts the user to 
enter two points (x1, y1) and (x2, y2) and displays their distance. The for
mula for computing the distance is 2(x2- x1)2 + (y2- y1)2. Note you can use 
Math.pow(a, 0.5) to compute 2a. Here is a sample run:
 * @author Owner
 */
public class two_15 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.printf("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double a = Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2);
        
        System.out.printf("%s%f", "The distance between the two points is ", Math.pow(a, .5));
        
        
    }
    
}
