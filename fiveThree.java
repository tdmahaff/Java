/*
(Conversion from kilograms to pounds) Write a program that displays the follow-
ing table (note 1 kilogram is 2.2 pounds):
Kilograms Pounds
1 2.2
3 6.6
. . .
197 433.4
199 437.8
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveThree {
    
    public static void main(String[] args){
        System.out.printf("%-12s%10s\n", "Kilograms", "Pounds");
        for(int i = 1; i <= 199; i += 2){
            System.out.printf("%-12d%12.1f\n", i, i * 2.2);
        }
    
    
    }
    
}
