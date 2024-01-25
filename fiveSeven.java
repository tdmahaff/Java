/*
 (Financial application: compute future tuition) Suppose the tuition for a univer-
sity is $10,000 this year and increases 5% every year. In one year, the tuition will
be $10,500. Write a program that displays the tuition in 10 years, and the total
cost of four years’ worth of tuition starting after the tenth year.
 */
package chapter.pkg5;
import java.util.*;


/**
 *
 * @author tdmah
 */
public class fiveSeven {
    public static void main(String[] args){
        
        double tuition = 10000, fourYearTuition = 0;
        
        for(int i = 0; i < 14; i++){
            
            tuition *= 1.05;
            
            if(i == 9){
                System.out.printf("Tuition in 10 years: %10.2f\n", tuition);
            }
            if(i >= 10){
                fourYearTuition += tuition;
            }
            
            
        }
        
        System.out.printf("Total cost of four years' worth of tuition after "
                + "tenth year: %10.2f", fourYearTuition);
        
    }
    
}
