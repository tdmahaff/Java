/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;
import java.util.Scanner;
/**
 *
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the 
side of a hexagon and displays its area. The formula for computing the area of a 
hexagon is
Area = 323
2 s2,
where s is the length of a side. Here is a sample run:
 * @author Owner
 */
public class two_16 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter the length of the side: ");
        double s = input.nextDouble();
        double area = 3 * Math.sqrt(3) / 2 * Math.pow(s, 2);
        
        System.out.printf("The area of the hexagon is %f", area);
        
        
    }
    
}
