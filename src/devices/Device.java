package devices;

import java.util.Date;

public abstract class Device {
    public String Model;
    public String Marka;
    final String Producer;
    public Date Date;

    protected Device() {
        Producer = "Producent";
    }

    @Override
    public String toString() {
        return "Device{" +
                "Model='" + Model + '\'' +
                ", Marka='" + Marka + '\'' +
                ", Producent='" + Producer + '\'' +
                ", Data=" + Date +
                '}';
    }

    public abstract void turnOn();
}
