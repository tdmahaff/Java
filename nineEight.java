/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg9d;
import java.util.*;
/**
 *
 * @author tdmah
 */
public class nineEight {
    public static void main(String[] args){
        
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        fan1.setSpeed(3); fan1.setRadius(10); fan1.setColor("Yellow");
        fan1.setOn(true);
        
        fan2.setSpeed(2); fan2.setRadius(5); fan2.setColor("Blue");
        fan2.setOn(false);
        
        System.out.printf("%s\n", fan1.toString());
        System.out.printf("%s", fan2.toString());
        
    }
}

class Fan{
    
    int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;
    
    Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    int getSpeed(){
        return this.speed;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    boolean getOn(){
        return this.on;
    }
    void setOn(boolean on){
        this.on = on;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color = color;
    }
    public String toString(){
        
        String returnString = "";
        if(this.on){
            returnString = "Fan speed: " + this.speed + " Color: " + this.color + 
                    " Radius: " + this.radius;
        }
        else{
            returnString = "Fan color: " + this.color + " Radius: " + this.radius + 
                    " fan is off";
        }
        
            return returnString;
        }
        
    
    }
    

