/*
(Count vowels and consonants) Assume that the letters A, E, I, O, and U are vow-
els. Write a program that prompts the user to enter a string, and displays the
number of vowels and consonants in the string
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class fiveFortyNine {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        int vowels = 0, consonants = 0;
        String str1 = input.nextLine();
        
        for(int i = 0; i < str1.length() - 1; i++){
            switch(str1.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': 
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': vowels++; break;
                default: consonants++; break;
            }
        }
        
        System.out.printf("The number of vowels is %d\n", vowels);
        System.out.printf("The number of consonants is %d", consonants);
        
    }
}
