package com.company;

import devices.Car;
import devices.Device;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        // __________________________________1
        Human human = new Human();
        human.pet.setWeight(500d);
        System.out.println(human.pet.getWeight());
        human.pet.takeForAWalk();
        human.pet.takeForAWalk();
        human.pet.takeForAWalk();
        human.pet.feed();
        human.pet.feed();
        human.pet.feed();
        human.pet.feed();
        System.out.println(human.pet.getWeight());

        // __________________________________2
        Car car = new Car("marka", "producer");
        human.setCar(car);
        System.out.println(human.getCar().Marka + ' ' + human.getCar());

        // __________________________________3+4
        System.out.println();
        human.getSalary();
        human.setSalary(3500d);
        System.out.println("Pańska wypłata wynosi teraz: " + human.getSalary());


        // __________________________________5
        System.out.println();

        human.setValueOfTheCar(5000d);
        human.getValueOfTheCar();

        // __________________________________6
        System.out.println();
        Car newCar = new Car("markaNowa", "producerNowy");
        Car newerCar = new Car("markaNowa", "producerNowy");

        if(newCar == newerCar)
            System.out.println("To te same auta :O");
        else
            System.out.println("To NIE te same auta :O");

        System.out.println("New car " + newCar.Marka + ' ' + newCar.getProducer());
        System.out.println("Newer car " + newerCar.Marka + ' ' + newerCar.getProducer());

        System.out.println("car.toString() " + car.toString());
        System.out.println("human.getCarToString() " + human.getCarToString());

        // __________________________________6
        System.out.println();
        Phone phone = new Phone();
        phone.turnOn();

        Device device = new Device() {
            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            public void turnOn() {
                System.out.println("Urządzenie ma metodę włącz");
            }
        };

        device.toString();
        device.turnOn();
    }
}