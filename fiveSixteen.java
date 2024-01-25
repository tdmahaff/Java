/*
 * (Find the factors of an integer) Write a program that reads an integer and dis-
plays all its smallest factors in an increasing order. For example, if the input
integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package chapter.pkg5;
import java.util.*;

/**
 *
 * @author tdmah
 */
public class fiveSixteen {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an integer: ");
        int num1 = input.nextInt();
        
        for(int i = 2; (i < (num1 / 2)); i++){
            
            if(num1 % i == 0){
                System.out.printf("%d ", i);
            }
            
        }
        
    }
    
}
