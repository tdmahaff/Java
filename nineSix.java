/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg9b;

/**
 *
 * @author tdmah
 */
public class nineSix {
    public static void main(String[] args){
        
        int array[] = new int[100000];
        
        for(int i = 0; i < 100000; i++){
            array[i] = (int)((Math.random()*999) + 1);
        }
        StopWatch watch1 = new StopWatch();
        watch1.start();
        selectionSort(array);
        watch1.stop();
        System.out.printf("Time to organize is: %f seconds", (double)watch1.getElapsedTime() / 1000 + (double)watch1.getElapsedTime() % 1000);
        
    }
    
public static void selectionSort(int array[]){
        
        for(int i = 0; i < array.length - 1; i++){
            
            int min = i;
            
            for(int j = i + 1; j < array.length; j++){

                if(array[j] < array[i]){
                    min = j;
             }

             
             int temp = array[min];
             array[min] = array[i];
             array[i] = temp;
                
            
            }
            
        }
          
    }

}

class StopWatch{
    private long startTime;
    private long endTime;
    
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
