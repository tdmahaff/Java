/*
 * (Stopwatch) Design a class named StopWatch. The class contains:
■■ Private data fields startTime and endTime with getter methods.
■■ A no-arg constructor that initializes startTime with the current time.
■■ A method named start() that resets the startTime to the current time.
■■ A method named stop() that sets the endTime to the current time.
■■ A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.
 */
package chapter.pkg9c;

/**
 *
 * @author tdmah
 */
public class nineSix {
    public static void main(String[] args){
    
        int randomArray[] = new int[100000];
        for(int i = 0; i < 100000; i++){
            
            randomArray[i] = (int)(Math.random() * 100000 + 1);
            
        }
        
        StopWatch stopWatch1 = new StopWatch();
        stopWatch1.start();
        selectionSort(randomArray);
        stopWatch1.stop();
        System.out.printf("Elapsed time is %10d nanoseconds ", stopWatch1.getElapsedTime());
        
    }
    
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    
}

class StopWatch{
    private long startTime, endTime;
    
    StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    void start(){
        this.startTime = System.currentTimeMillis();
    }
    void stop(){
        this.endTime = System.currentTimeMillis();
    }
    long getElapsedTime(){
        return this.endTime - this.startTime;
    }

}
