package com.company;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.pet.setWeight(500d);
        human.pet.getWeight();
        human.pet.takeForAWalk();
        human.pet.takeForAWalk();
        human.pet.takeForAWalk();
        human.pet.feed();
        human.pet.feed();
        human.pet.feed();
        human.pet.getWeight();
    }
}