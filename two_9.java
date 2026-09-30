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
public class two_9 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter v0, v1, and t: ");
        
        double vo = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        System.out.printf("%s%f", "The average acceleration is ", (v1 - vo) / t);
        
        
    }
}
