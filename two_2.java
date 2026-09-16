/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;
import java.util.Scanner;
/**
 *
 * (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * π
volume = area * length
Here is a sample run:
 * @author Owner
 */
public class two_2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.printf("%s%f%s%f", "The area is ", area, " The volume is ", volume);
        
        
    }
    
}
