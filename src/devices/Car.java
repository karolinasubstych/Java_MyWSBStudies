package devices;

public class Car {
    protected String Model;
    public final String Marka;
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
}
