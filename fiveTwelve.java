/*
(Find the smallest n such that n2 > 12,000) Use a while loop to find the small-
est integer n such that n2 is greater than 12,000.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveTwelve {
    public static void main(String[] args){
        
        int n = 0;
        while(Math.pow(n, 2) < 12000){
            n++;
        }
        
        System.out.printf("Smallest integer n such that n^2 > 12000: %d", n);
        
    }
}
