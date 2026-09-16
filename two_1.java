/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liang_2;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class two_1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a Celsius degree: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.printf("%f%s%f%s", celsius, " Celsius is ", fahrenheit, " Fahrenheit");
        
        
    }
}
