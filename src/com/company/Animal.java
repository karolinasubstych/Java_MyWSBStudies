package com.company;

public class Animal {
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    private Double weight;
    final String species = "Koń";

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
}