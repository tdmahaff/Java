/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.pkg9d;

/**
 *
 * @author tdmah
 */
public class nineOne {
    public static void main(String[] args){
        
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.printf("R1 width: %f\n", r1.getWidth());
        System.out.printf("R1 height: %f\n", r1.getHeight());
        System.out.printf("R1 area: %f\n", r1.getArea());
        System.out.printf("R1 perimiter: %f\n", r1.getPerimeter());
        System.out.printf("R2 width: %f\n", r2.getWidth());
        System.out.printf("R2 height: %f\n", r2.getHeight());
        System.out.printf("R2 area: %f\n", r2.getArea());
        System.out.printf("R2 perimiter: %f\n", r2.getPerimeter());
    }
}

class Rectangle{
    private double width;
    private double height;
    
    Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    double getWidth(){
        return this.width;
    }
    
    double getHeight(){
        return this.height;
    }
    
    double getArea(){
        return this.width * this.height;
    }
    
    double getPerimeter(){
        return this.width * 2 + this.height * 2;
    }
    
}
