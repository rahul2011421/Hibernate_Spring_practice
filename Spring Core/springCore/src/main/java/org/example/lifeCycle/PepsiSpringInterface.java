package org.example.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiSpringInterface implements InitializingBean, DisposableBean {
    private double price;
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public PepsiSpringInterface(){
        return;
    }
    @Override
    public String toString(){
        return "Pepsi : "+ price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("drinking pepsi init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("throwing pepsi bottle");
    }
}
