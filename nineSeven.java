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
public class nineSeven {
    public static void main(String[] args){
        
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(.045);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.printf("Balance: %f\n", a1.getBalance());
        System.out.printf("Monthly interest rate: %f\n", a1.getMonthlyInterestRate());
        System.out.printf("Date created: %s", a1.getDateCreated());
        
    }
}

class Account{
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated = new Date();

    Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        
    }
    
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    int getID(){
        return this.id;
    }
    void setID(int id){
        this.id = id;
    }
    double getBalance(){
        return this.balance;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    String getDateCreated(){
        return this.dateCreated.toString();
    }
    double getMonthlyInterestRate(){
        return this.annualInterestRate / 12; 
    }
    double getMonthlyInterest(){
        return (this.annualInterestRate / 12) * this.balance;
    }
    void withdraw(double amount){
       this.balance = this.balance - amount;
    }
    void deposit(double amount){
       this.balance = this.balance + amount;
    }
    
}
