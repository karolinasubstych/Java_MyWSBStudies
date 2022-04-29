package com.company;

import creatures.Animal;
import devices.*;

public class Main {
    public static void main(String[] args) {
        Car carDiesel = new Diesel("Ferrari", "Lamborgini");
        Car carLpg = new LPG("Ferrari", "Lamborgini");
        Car carElectric = new Electric("Tesla", "Audi");
        // __________________________________1
        Human human = new Human(new Car[]{carElectric, carDiesel, carLpg});
        human.pet = new Animal() {
            @Override
            public void feed(double foodWeight) {

            }
        };
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
        Car car = new Car("Zadanie 10", "Poprawione Get Set Car") {
            @Override
            public boolean Sell(Human seller, Human buyer, Double price) {
                String wantsCar = "Lamborgini";
                Boolean hasCar = false;
                int carPosition = 0;
                for(int i=0;i<seller.car.length;i++){
                    if (buyer.car[i].marka == wantsCar) {
                        hasCar = true;
                        carPosition = i;
                        break;
                    }
                }

                if(!hasCar)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }


                if(!buyer.hasSpaceInGarage)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                if(buyer.salary < price)
                {
                    try {
                        throw new Exception();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                buyer.car[carPosition] = seller.car[carPosition];
                buyer.salary = buyer.salary - price;
                seller.car[carPosition] = null;
                seller.salary = seller.salary + price;

                System.out.println("Sukces kupna/sprzedaży auta!");
                return true;
            }

            @Override
            public void refuel() {
                System.out.println("Paliwko ++");
            }
        };
        human.setCar(car, 2);
        System.out.println(human.getCar(2).marka + ' ' + human.getCar(2).getProducer());

        // __________________________________3+4
        System.out.println();
        human.getSalary();
        human.setSalary(3500d);
        System.out.println("Pańska wypłata wynosi teraz: " + human.getSalary());


        // __________________________________5
        System.out.println();

        human.setValueOfTheCar(5000);
        human.getValueOfTheCar();

        // __________________________________6
//        System.out.println();
//        Car newCar = new Car("markaNowa", "producerNowy") {
//            @Override
//            protected void refuel() {
//                System.out.println("Paliwko ++");
//            }
//        };
//        Car newerCar = new Car("markaNowa", "producerNowy") {
//            @Override
//            protected void refuel() {
//                System.out.println("Paliwko ++");
//            }
//        };
//
//        if(newCar == newerCar)
//            System.out.println("To te same auta :O");
//        else
//            System.out.println("To NIE te same auta :O");
//
//        System.out.println("New car " + newCar.marka + ' ' + newCar.getProducer());
//        System.out.println("Newer car " + newerCar.marka + ' ' + newerCar.getProducer());
//
//        System.out.println("car.toString() " + car.toString());
//        System.out.println("human.getCarToString() " + human.getCarToString());

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

        // __________________________________7
        System.out.println();
        Human buyer = new Human(new Car[]{carElectric, carDiesel, carLpg});
        Human seller = new Human(new Car[]{carElectric, carDiesel, carLpg});
        buyer.pet = new Animal() {
            @Override
            public void feed(double foodWeight) {

            }
        };
        seller.pet = new Animal() {
            @Override
            public void feed(double foodWeight) {

            }
        };
        buyer.pet.species = "Koń";
        seller.pet.species = "Koń";
        buyer.salary = 200d;
        seller.salary = 0d;
        double price = 200;
        boolean sellResult = human.pet.sellable.Sell(seller, buyer, price);
        if(sellResult)
            System.out.println("Sprzedano " + seller.pet.species + " za " + price);
        else
            System.out.println("Nie sprzedano " + seller.pet.species + " za " + price);

        buyer.pet.species = "Human";
        buyer.salary = 200d;
        seller.salary = 0d;
        sellResult = human.pet.sellable.Sell(seller, buyer, price);
        if(sellResult)
            System.out.println("Sprzedano " + seller.pet.species + " za " + price);
        else
            System.out.println("Nie sprzedano " + seller.pet.species + " za " + price);

        // __________________________________11
        System.out.println();
        Car carWithGarageSize = new Car(12) {
            @Override
            public boolean Sell(Human seller, Human buyer, Double price) {
                return false;
            }

            @Override
            protected void refuel() {}
        };

        human.setCar(new Electric("Elektryczna", "Tesla"), 0);
        human.setCar(new LPG("Gazowa", "Tesla"), 1);
        human.setCar(new Diesel("Dieslowa", "Tesla"), 2);

        System.out.println("Wartość aut w garażu to " + human.getValueOfTheGarage());

        // Wyrzuci wyjątek, ale działa, jak wartości się przypisze
        car.Sell(human, human, 150d);
    }
}