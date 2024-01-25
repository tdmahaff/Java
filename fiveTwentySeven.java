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
