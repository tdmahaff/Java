/*
(Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer.
toBinaryString(int) in this program
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveThirtySeven {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a decimal integer: ");
        int num1 = input.nextInt();
        
        int biNum = 0, temp = 0;
        
        while(num1 != 0){
            
            biNum = biNum * 10 + num1 % 2;
            num1 /= 2;
            
        }
        
        while(biNum != 0){
            
            temp = temp * 10 + biNum % 10;
            biNum /= 10;
            
        }
        
        System.out.printf("Corresponding binary value: %d", temp);
        
    }
    
}
