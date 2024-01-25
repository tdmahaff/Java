/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveThree {
    
    public static void main(String[] args){
        System.out.printf("%-12s%10s\n", "Kilograms", "Pounds");
        for(int i = 1; i <= 199; i += 2){
            System.out.printf("%-12d%12.1f\n", i, i * 2.2);
        }
    
    
    }
    
}
