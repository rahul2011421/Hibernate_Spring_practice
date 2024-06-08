package org.example.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
   //@Autowired
   //@Qualifier("address2")
    private Address address;

    public Address getAddress() {
        return address;
    }
    @Autowired
    @Qualifier("address2")
    public void setAddress(Address address) {
        System.out.println("setting the value");
        this.address = address;
    }

    public Employee() {
    }
    //@Autowired
    public Employee(Address address) {
        System.out.println("setting it by constructor");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
