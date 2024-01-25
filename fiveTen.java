/*
 (Find numbers divisible by 5 and 6) Write a program that displays all the num-
bers from 100 to 1,000 (10 per line) that are divisible by 5 and 6. Numbers are
separated by exactly one space.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveTen {
    public static void main(String[] args){
        
        int counter = 0;
        
        for(int i = 100; i <= 1000; i++){
            if((i % 5 == 0) && (i % 6 == 0)){
                counter++;
                if(counter % 10 == 0){
                    System.out.printf("\n");
                }
            
                System.out.printf("%d ", i);
                
            }
        }
    }
}
