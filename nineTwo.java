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
public class nineTwo {
    public static void main(String[] args){
        
        Stock s1 = new Stock("ORCL", "Oracle Corporation");
        s1.previousClosingPrice = 34.5;
        s1.currentPrice = 34.35;
        System.out.printf("Price-change percentage: %f", s1.getChangePercent());
        
        
    }
}

class Stock{
    
    String symbol, name;
    double previousClosingPrice, currentPrice;
    
    Stock(String symbol, String name){
        
        this.symbol = symbol;
        this.name = name;
        
    }
    
    double getChangePercent(){
        
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        
    }
    
}
    
