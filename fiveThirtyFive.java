/*
 * (Summation) Write a program to compute the following summation:
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveThirtyFive {
    public static void main(String[] args){
        
        double total = 0;
        
        for(int i = 1; i <= 624; i++){
            
            total += (1 / (Math.sqrt(i) + Math.sqrt(i + 1)));
            
        }
        
        System.out.printf("Total is: %10.25f", total);
        
    }
    
}
