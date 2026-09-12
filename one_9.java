/*
(Area and perimeter of a rectangle) Write a program that displays the area and
perimeter of a rectangle with a width of 4.5 and a height of 7.9 using the fol-
lowing formula:
area = width * height
 */

public class one_9 {

    public static void main(String[] args){

        double width = 4.5, height = 7.9;

        System.out.printf("Area is %f\n", width * height);
        System.out.printf("Perimeter is %f\n", 2 * width + 2 * height);

    }
}
