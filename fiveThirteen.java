/*
 * (Find the largest n such that n3 6 12,000) Use a while loop to find the largest
integer n such that n3 is less than 12,000.
 */
package chapter.pkg5;

/**
 *
 * @author tdmah
 */
public class fiveThirteen {
    public static void main(String[] args){
        
        int n = 0;
        while(Math.pow(n, 3) < 12000){
            n++;
        }
        
        System.out.printf("Largest n such that n^3 < 12000: %d", n);
        
    }
}
