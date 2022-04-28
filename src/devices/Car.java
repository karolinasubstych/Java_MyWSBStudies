package devices;

public class Car extends Device {
    protected String Model;
    final String Producer;
    protected String Color;
    public Double Value;

    public String getProducer() {
        return Producer;
    }

    public Car(String marka, String producer) {
        Marka = marka;
        Producer = producer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Marka='" + Marka + '\'' +
                ", Producer='" + Producer + '\'' +
                ", Color='" + Color + '\'' +
                ", Value=" + Value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Auto ma metodę włącz");
    }
}
