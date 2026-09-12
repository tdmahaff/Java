/*
Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
minutes, and 35 seconds. Write a program that displays the average speed in
kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */


public class one_12 {

    public static void main(String[] args){

        double hours = 1 + 2 / 3.0 + 35 / 3600.0;
        double kilometers = 24 * 1.6;

        System.out.printf("Average speed is %f kilometers per hour", kilometers / hours);

    }

}
