package devices;

import com.company.Human;

public class Electric extends Car {
    public Electric(String marka, String producer) {
        super(marka, producer);
    }

    @Override
    protected void refuel() {
        System.out.println("Ladowanie elektryka ++");
    }

    @Override
    public boolean Sell(Human seller, Human buyer, Double price) {
        return false;
    }
}
