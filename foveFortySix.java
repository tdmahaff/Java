/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg5;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class foveFortySix {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a string: ");
        String str1 = input.next();
        
        System.out.printf("The reversed string is: ");
        for(int i = str1.length() - 1; i >= 0; i--){
            
            System.out.printf("%c", str1.charAt(i));
            
        }
        
    }
    
}
