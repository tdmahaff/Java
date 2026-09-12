/*
(Area and perimeter of a circle) Write a program that displays the area and pe-
rimeter of a circle that has a radius of 5.5 using the following formulas:
perimeter = 2 * radius * pi
area = radius * radius * pi
 */


public class one_8 {

    public static void main(String[] args){

        double radius = 5.5;
        System.out.printf("Perimeter is %f\n", 2 * radius * Math.PI);
        System.out.printf("Area is %f\n", radius * radius * Math.PI);

    }
}
