/*
 *(Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0
+ 0.000000001 is equal to 100000000.0. To avoid cancellation errors and
obtain more accurate results, carefully select the order of computation. For ex-
ample, in computing the following summation, you will obtain more accurate
results by computing from right to left rather than from left to right:
1 + 1
2 + 1
3 + c + 1
n
Write a program that compares the results of the summation of the preceding
series, computing from left to right and from right to left with n = 50000.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveTwentyThree {
    public static void main(String[] args){
        
        double totalOne = 0, totalTwo = 0;
        
        for(int i = 1; i <= 50000; i++){
            
            totalOne += ((double)1 / i);
                    
        }
        
         for(int i = 50000; i >= 1; i--){
            
            totalTwo += ((double)1 / i);
                    
        }
         
        System.out.printf("Left to right total: %2.25f\n", totalOne);
        System.out.printf("Right to left total: %2.25f", totalTwo);
        
    }
    
}
