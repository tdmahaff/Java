//(Approximate p) p can be computed using the following formula:
// pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
// write a progra that displays the result of
// 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 )
// 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)


public class one_7 {

    public static void main(String[] args){

        double sum1 = 0, sum2 = 0;

        for(int i = 0; i < 6; i++){

            sum1 += Math.pow(-1, i) * ((double)1 / ((2 * i) + 1));

        }

        for(int i = 0; i < 7; i++){

            sum2 += Math.pow(-1, i) * ((double) 1 / ((2 * i) + 1));

        }

        System.out.printf("Sum 1 is %f\n", 4 * sum1);
        System.out.printf("Sum 2 is %f\n", 4 * sum2);

    }
}
