/*
 (Find numbers divisible by 5 or 6, but not both) Write a program that displays
all the numbers from 100 to 200 (10 per line) that are divisible by 5 or 6, but not
both. Numbers are separated by exactly one space.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveEleven {
    public static void main(String[] args){
        
        int counter = 0;
        
        for(int i = 100; i <= 200; i++){
            
            if((i % 5 == 0) && (i % 6 == 0)){
                continue;
            }
            else if(i % 5 == 0 || i % 6 == 0){
                counter++;
                if(counter % 10 == 0){
                    
                    System.out.printf("%s", "\n");
                    
                }
                
                System.out.printf("%d ", i);
                
            }
            
            
        }
        
    }
}
