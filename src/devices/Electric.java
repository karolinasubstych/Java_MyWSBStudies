package devices;

public class Electric extends Car {
    public Electric(String marka, String producer) {
        super(marka, producer);
    }

    @Override
    protected void refuel() {
        System.out.println("Ladowanie elektryka ++");
    }
}
