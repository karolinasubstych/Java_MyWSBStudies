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
        human.car = car;
        System.out.println(human.car.Marka + ' ' + human.car.Producer);


    }
}