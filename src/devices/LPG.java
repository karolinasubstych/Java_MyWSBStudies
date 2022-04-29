package devices;

public class LPG extends Car {
    public LPG(String marka, String producer) {
        super(marka, producer);
    }

    @Override
    protected void refuel() {
        System.out.println("Tankowanie Ferrari ++");
    }
}
