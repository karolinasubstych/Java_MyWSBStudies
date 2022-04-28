package com.company;

public class Animal {
    private Double weight;
    String species = "Koń";
    String owner;

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    protected void feed() {
        if (this.weight > 0)
            this.weight += 0.1;
        else
            System.out.println(this.species + " nie żyje!");
    }

    protected void takeForAWalk() {
        if (this.weight > 0)
            this.weight -= 0.1;
        else
            System.out.println(this.species + " nie żyje!");
    }

    public Sellable sellable = new Sellable() {
        @Override
        public boolean Sell(Human seller, Human buyer, Double price) {
            buyer.salary = 5000d;
            if(buyer.pet.species != seller.pet.species)
            {
                System.out.println("Sprzedający niestety nie ma tego zwierzęcia!");
                return false;
            }
            if(price > buyer.salary)
            {
                System.out.println("Sprzedającego nie stać na to zwierzę!");
                return false;
            }
            if(buyer.pet.species == "Człowiek" || seller.pet.species == "Człowiek" || buyer.pet.species == "Human" || seller.pet.species == "Human")
                System.out.println("Nie można handlować ludźmi!");

            buyer.salary = buyer.salary - price;
            seller.salary = seller.salary + price;

            owner = seller.name;
            return true;
        }
    };
}