package devices;

import java.util.Date;

public abstract class Device {
    public String model;
    public String marka;
    final String producer;
    public Date date;

    protected Device() {
        this.producer = "Producent";
    }

    @Override
    public String toString() {
        return "Device{" +
                "Model='" + this.model + '\'' +
                ", Marka='" + this.marka + '\'' +
                ", Producent='" + this.producer + '\'' +
                ", Data=" + this.date +
                '}';
    }

    public abstract void turnOn();
}
