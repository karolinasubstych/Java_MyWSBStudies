package devices;

import com.company.Sellable;

public abstract class Car extends Device implements Sellable {
    protected String model;
    final String producer;
    protected String color;
    public int value;
    public int garageSize;
    public int productionYear;

    public String getProducer() {
        return this.producer;
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
