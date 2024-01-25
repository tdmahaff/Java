/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score. Use
the next() method in the Scanner class to read a name rather than using the
nextLine() method. Assume that the number of students is at least 2.
 */

package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveNine {
    public static void main(String[] args){
        
        int numStudents = 0, count = 0, score = 0, highestScore = 0, 
                secondHighestScore = 0;
        String name = "", highestName = "", secondHighestName = "";
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter the number of students: ");
        numStudents = input.nextInt();
        
        //trap
        while(numStudents < 2){
            System.out.printf("%s", "Invalid entry. Enter number of students: ");
            numStudents = input.nextInt();
        }
        
        while(count < numStudents){
            
            System.out.printf("Enter student name: ");
            name = input.next();
            System.out.printf("Enter student score: ");
            score = input.nextInt();
            
            if(score > highestScore){
                secondHighestScore = highestScore;
                secondHighestName = highestName;
                highestScore = score;
                highestName = name;
            }
            
            count++;
            
        }
        
        System.out.printf("Name of student with highest score: %s\n", highestName);
        System.out.printf("Highest score of: %d\n", highestScore);
        
        System.out.printf("Name of student with second highest score: %s\n", 
                secondHighestName);
        System.out.printf("Second highest score of: %d", secondHighestScore);
        
    }
}
