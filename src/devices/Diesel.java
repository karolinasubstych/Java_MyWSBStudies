package devices;

public class Diesel extends Car  {
    public Diesel(String marka, String producer) {
        super(marka, producer);
    }

    @Override
    protected void refuel() {
        System.out.println("Tankowanie TIR'a ++");
    }
}
