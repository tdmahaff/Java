/*
(Display leap years) Write a program that displays all the leap years, 10 per line,
from 101 to 2100, separated by exactly one space. Also display the number of
leap years in this period.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveTwentySeven {
    public static void main(String[] args){
        
        int counter = 0;
        
        for(int i = 101; i <= 2100; i++){
            
            if(i % 4 == 0 && i % 100 != 0){
            
                System.out.printf("%d ", i);
                counter++;
                
                if(counter % 10 == 0){
                    System.out.printf("\n");
                }
                
            }   
            
        }
        
        System.out.printf("Number of leap years: %d", counter);
        
    }
    
}
