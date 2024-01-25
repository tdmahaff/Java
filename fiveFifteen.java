/*
 *(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display 10 characters per line. The ASCII
table is given in Appendix B. Characters are separated by exactly one space.
 */
package chapter.pkg5;

/**
 *
 * @author tdmah
 */
public class fiveFifteen {
    public static void main(String[] args){
        
        int counter = 0;
       
        for(int i = 33; i <= 126; i++){
            
            counter++;
            if(counter % 10 == 0){
            
            System.out.printf("\n");
            
            }
            
        System.out.printf("%c", (char)i);
        
        }
        
    }
    
}