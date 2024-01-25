/*
 (Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d–1, d–2, …, 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveFourteen {
    public static void main(String[] args){
        
        int d = 0, n1, n2, gcd = 0;
        boolean first = true;
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter number 1: ");
        n1 = input.nextInt();
        System.out.printf("%s", "Enter number 2: ");
        n2 = input.nextInt();
        
        if(n1 < n2){
            d = n1;
        }else if(n1 > n2){
            d = n2;
        }
        
        for(int i = d; i > 0; i--){
            
            if((n1 % i == 0) && (n2 % i == 0)){
                gcd = i;
                System.out.printf("Greatest common denominator is: %d", gcd); 
                break;
            }
            
            
        }
        
    }
}
