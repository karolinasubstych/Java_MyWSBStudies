package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    protected Car car;
    protected Double salary;

    public Double getSalary() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Kiedy pobarno dane?"+formatter.format(date));
        return salary;
    }

    Animal pet = new Animal();
}