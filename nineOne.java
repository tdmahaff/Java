/*
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,
design a class named Rectangle to represent a rectangle. The class contains:
■■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■■ A no-arg constructor that creates a default rectangle.
■■ A constructor that creates a rectangle with the specified width and height.
■■ A method named getArea() that returns the area of this rectangle.
■■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test pro-
gram that creates two Rectangle objects—one with width 4 and height 40, and
the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order.
 */
package chapter.pkg9c;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class nineOne {
    public static void main(String[] args){
    Rectangle rec1 = new Rectangle(4, 40);
    Rectangle rec2 = new Rectangle(3.5, 35.9);
    System.out.printf("Rec1 width: %5.2f, height: %5.2f, area: %5.2f, perimeter:"
            + " %5.2f\n", rec1.width, rec1.height, rec1.getArea(), rec1.getPerimeter());
    System.out.printf("Rec2 width: %5.2f, height: %5.2f, area: %5.2f, perimeter:"
            + " %5.2f\n", rec2.width, rec2.height, rec2.getArea(), rec2.getPerimeter());
    }
    
}

class Rectangle{
    
    double width, height;
    
    Rectangle(){
        width = 1;
        height = 1;
    }
    
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    double getArea(){
        return this.width * this.height;
    }
    
    double getPerimeter(){
        return 2 * this.width + 2 * this.height;
    }
    
}
