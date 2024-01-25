/*
Conversion from kilograms to pounds and pounds to kilograms) Write a pro-
gram that displays the following two tables side by side:
Kilograms Pounds | Pounds Kilograms
1 2.2 | 20 9.09
3 6.6 | 25 11.36
. . .
197 433.4 | 510 231.82
199 437.8 | 515 234.09
 * and open the template in the editor.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveFive {
    public static void main(String[] args){
        
        int pounds = 20;
        
        System.out.printf("%-20s%-15s%-5s", "Kilograms", "Pounds", "|");
        System.out.printf("%-20s%-15s\n", "Pounds", "Kilograms");
        for(int i = 1; i <= 199; i+=2){
            
            System.out.printf("%-20d%-15.1f%-5s", i, i * 2.2, "|");
            System.out.printf("%-20d%-15.2f\n", pounds, pounds * .4536);
            pounds += 5;
        }
    }
        
}

