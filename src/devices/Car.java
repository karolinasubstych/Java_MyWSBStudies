package devices;

import com.company.Human;
import com.company.Sellable;

import java.util.ArrayList;

public abstract class Car extends Device implements Sellable {
    protected String model;
    final String producer;
    protected String color;
    public int value;
    public int garageSize;
    public int productionYear;
    public ArrayList<String> ownerList = new ArrayList<String>() {
        { add("Karolina");}};
    public String actualOwner = ownerList.get(ownerList.size() - 1);

    public String getProducer() {
        return this.producer;
    }

    public boolean checkForOwners() {
        if (ownerList.size() == 0) {
            System.out.println("Brak właścicieli!");
            return false;
        }
        return true;
    }

    public int getNumberOfSells() {
        return ownerList.size();
    }

    public boolean checkIfASoldB(Human humanA, Human humanB) {
        for(int i=0;i<humanA.car.length;i++)
        {
            if(humanA.car[i].actualOwner == humanB.name)
                return humanA.car[i].actualOwner == humanB.name;
        }
        return false;
    }

    public void setOwnerList(ArrayList<String> ownerList) {
        this.ownerList = ownerList;
    }

    public void setActualOwner(String actualOwner) {
        this.ownerList.add(actualOwner);
        this.actualOwner = actualOwner;
    }

    public Car(String marka, String producer) {
        this.model = marka;
        this.producer = producer;
        this.value = marka.length() * 20;
        this.productionYear = marka.length() * 20;
    }

    public Car(int garageSize) {
        this.garageSize = garageSize;
        this.producer = "Fiat";
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + this.model + '\'' +
                ", Producer='" + this.producer + '\'' +
                ", ProductionYear='" + this.productionYear + '\'' +
                ", Color='" + this.color + '\'' +
                ", Value=" + this.value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Auto ma metodę włącz");
    }

    protected abstract void refuel();
}
