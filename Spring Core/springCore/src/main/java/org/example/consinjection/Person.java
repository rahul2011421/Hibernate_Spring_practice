package org.example.consinjection;

import java.util.List;

public class Person {
    private String name;
    private int id;
    private Certificate certificate;
    private List<Integer> marks;
    public Person(String name, int id, Certificate certificate,List<Integer> marks) {
        this.name = name;
        this.id=id;
        this.certificate=certificate;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return this.name+" : "+ this.id +" : "+" { " + this.certificate.name+" : "+ this.marks+" } ";
    }


//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                ", certificate=" + certificate +
//                ", marks=" + marks +
//                '}';
//    }
}
