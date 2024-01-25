/*
 (Perfect number) A positive integer is called a perfect number if it is equal to the sum
of all of its positive divisors, excluding itself. For example, 6 is the first perfect num-
ber because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are
four perfect numbers 6 10,000. Write a program to find all these four numbers.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveThirtyThree {
    public static void main(String[] args){
        
        int total = 0;
        
        for(int i = 2; i < 10000; i++){
            
            for(int j = 1; (j <= (i / 2)); j++){
                
                if(i % j == 0){
                    total += j;
                }    
                
            }
            
            if(total == i){
                System.out.printf("Perfect number is %d\n", total);
            }
            
            total = 0;
                
        }
        
        
    }
}
