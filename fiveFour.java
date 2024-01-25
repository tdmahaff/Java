/*
 (Conversion from miles to kilometers) Write a program that displays the follow-
ing table (note 1 mile is 1.609 kilometers):
Miles Kilometers
1 1.609
2 3.218
. . .
9 14.481
10 16.090
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveFour {
    public static void main(String[] args){
        System.out.printf("%-12s%10s\n", "Miles", "Kilometers");
        
        for(int i = 1; i <= 10; i++){
            
        System.out.printf("%-12d%10.3f\n", i, i * 1.609);    
        
        }
        
    }
}
