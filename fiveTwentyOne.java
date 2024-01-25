/*
(Financial application: compare loans with various interest rates) Write a pro
gram that lets the user enter the loan amount and loan period in number of years, 
and displays the monthly and total payments for each interest rate starting from 
5% to 8%, with an increment of 1/8. Here is a sample run:
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveTwentyOne {
    
    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter loan amount and loan period in number of years: ");
        
        double loanAmount = input.nextDouble(); int numYears = input.nextInt();
        
        System.out.printf("%-20s%20s%20s\n", "Interest Rate", "Monthly Payment",
                "Total Payment");
                
        for(double i = 5.000; i <= 8; i += .125){
            
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    -1 / Math.pow(1 + monthlyInterestRate, numYears * 12));
            double totalPayment = monthlyPayment * numYears * 12;
            
            System.out.printf("%-20.3f%20.2f%20.2f\n", i, monthlyPayment, totalPayment);
            
        }
        
    }
    
}
