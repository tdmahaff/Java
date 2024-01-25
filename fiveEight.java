/*
 (Find the highest score) Write a program that prompts the user to enter the num-
ber of students and each student’s name and score, and finally displays the name
of the student with the highest score. Use the next() method in the Scanner
class to read a name, rather than using the nextLine() method. Assume that the
number of students is at least 1.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveEight {
    public static void main(String[] args){
        
        int numStudents = 0, count = 0, score = 0, highestScore = 0;
        String name = "", highestName = "";
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter the number of students: ");
        numStudents = input.nextInt();
        
        //trap
        while(numStudents < 1){
            System.out.printf("%s", "Invalid entry. Enter number of students: ");
            numStudents = input.nextInt();
        }
        
        while(count < numStudents){
            
            System.out.printf("Enter student name: ");
            name = input.next();
            System.out.printf("Enter student score: ");
            score = input.nextInt();
            
            if(score > highestScore){
                highestScore = score;
                highestName = name;
            }
            
            count++;
            
        }
        
        System.out.printf("Name of student with highest score: %s\n", highestName);
        System.out.printf("Highest score of: %d", highestScore);
        
        
        
    }
}
