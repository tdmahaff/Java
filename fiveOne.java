/*
(Count positive and negative numbers and compute the average of numbers)
Write a program that reads an unspecified number of integers, determines how
many positive and negative values have been read, and computes the total and av-
erage of the input values (not counting zeros). Your program ends with the input
0. Display the average as a floating-point number. Here are sample runs
 */
package chapter.pkg5;
import java.util.*;

/**
 *
 * @author tdmah
 */
public class fiveOne {
    public static void main(String[] args){
        
        int positives = 0, negatives = 0, total = 0, count = 0, x = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter an integer, the input ends if it is 0: ");
        do{
            x = input.nextInt();
            if(x > 0){
               positives++;
               total += x;
               count++;
            }else if(x < 0){
                negatives--;
                total += x;
                count++;
            }
  
        }while(x != 0);
        
        average = (double)total / count;
        
        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
        
        
    }
}
