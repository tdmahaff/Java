//(Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes
//and 30 seconds. Write a program that displays the average speed in miles per
//hour. (Note 1 mile is equal to 1.6 kilometers.)


public class one_10 {

    public static void main(String[] args){

        double hours = 45.5 / 60, miles = 14 * 1.6;
        System.out.printf("Speed in mph is %f", miles / hours);

    }

}
