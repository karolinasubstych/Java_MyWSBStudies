package creatures;

import com.company.Human;
import com.company.Sellable;

public abstract class Animal implements Feedable {
    protected Double weight;
    public String species = "Koń";
    protected String owner;

    public Animal(String species) {
        this.species = "Koń";
    }

    public Animal() {
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void feed() {
        if (this.weight > 0)
            this.weight += 0.1;
        else
            System.out.println(this.species + " nie żyje!");
    }

    public void takeForAWalk() {
        if (this.weight > 0)
            this.weight -= 0.1;
        else
            System.out.println(this.species + " nie żyje!");
    }

    public Sellable sellable = new Sellable() {
        @Override
        public boolean Sell(Human seller, Human buyer, Double price) {
            buyer.setSalary(5000d);
            if(buyer.pet.species != seller.pet.species)
            {
                System.out.println("Sprzedający niestety nie ma tego zwierzęcia!");
                return false;
            }
            if(price > buyer.getSalary())
            {
                System.out.println("Sprzedającego nie stać na to zwierzę!");
                return false;
            }
            if(buyer.pet.species == "Człowiek" || seller.pet.species == "Człowiek" || buyer.pet.species == "Human" || seller.pet.species == "Human")
                System.out.println("Nie można handlować ludźmi!");

            buyer.setSalary(buyer.getSalary() - price);
            seller.setSalary(seller.getSalary() + price);

            owner = seller.name;
            return true;
        }
    };
}