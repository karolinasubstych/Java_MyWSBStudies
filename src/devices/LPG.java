package devices;

import com.company.Human;

public class LPG extends Car {
    public LPG(String marka, String producer) {
        super(marka, producer);
    }

    @Override
    protected void refuel() {
        System.out.println("Tankowanie Ferrari ++");
    }

    @Override
    public boolean Sell(Human seller, Human buyer, Double price) {
        return false;
    }
}
