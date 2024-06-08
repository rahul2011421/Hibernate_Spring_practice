package org.example.consinjection;

public class Certificate {
     String name;
    public Certificate(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
