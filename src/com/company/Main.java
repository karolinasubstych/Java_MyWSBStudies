package com.company;

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
        System.out.println(human.getCar().Marka + ' ' + human.getCar().Producer);

        // __________________________________3+4
        System.out.println();
        human.getSalary();
        human.setSalary(3500d);
        System.out.println("Pańska wypłata wynosi teraz: " + human.getSalary());


        // __________________________________5
        System.out.println();

        human.setValueOfTheCar(5000d);
        human.getValueOfTheCar();
    }
}