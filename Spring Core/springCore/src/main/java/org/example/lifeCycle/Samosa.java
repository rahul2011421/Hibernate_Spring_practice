package org.example.lifeCycle;

import java.sql.SQLOutput;

public class Samosa {
    private double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public Samosa(){
        return;
    }
    @Override
    public String toString(){
        return "Samosa: "+price;
    }
    public void init(){
        System.out.println("inside init method");
    }
    public void destroy(){
        System.out.println("inside destroy method");
    }
}
