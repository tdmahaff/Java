/*
 * (Sum a series) Write a program to compute the following summation:
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveTwentyFour {
    public static void main(String[] args){
        
        int j = 0;
        double total = 0; 
        
        for(int i = 1; i <= 97; i += 2){
            j = i + 2;
            total += (double)i / j;
        }
        
        System.out.printf("Summation total is: %10.25f", total);
        
    }
}
