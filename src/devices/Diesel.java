package devices;

import com.company.Human;

public class Diesel extends Car  {
    public Diesel(String marka, String producer) {
        super(marka, producer);
    }

    @Override
    protected void refuel() {
        System.out.println("Tankowanie TIR'a ++");
    }

    @Override
    public boolean Sell(Human seller, Human buyer, Double price) {
        return false;
    }
}
