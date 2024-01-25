/*
(Compute p) You can approximate p by using the following summation:
Write a program that displays the p value for i = 10000, 20000, …, and 100000
 */
package chapter.pkg5;

/**
 *
 * @author tdmah
 */
public class fiveTwentyFive {
   
    public static void main(String[] args){
        
        double pi = 0;
        
        for(int i = 10000; i <= 100000; i+= 10000){
            
            for(int j = 1; j <= i; j++){
                
                pi += Math.pow(-1, j + 1) / (2 * j - 1); //alternating formula
                
            }
            
            pi *= 4; 
            
            System.out.printf("Pi value for i = %d is %10.20f\n", i, pi);
            
            pi = 0;
            
        }
        
    }
   
}
