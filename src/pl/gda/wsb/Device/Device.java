package pl.gda.wsb.Device;
import pl.gda.wsb.Producent;

    public  abstract class Device {
        final Producent producer;
        final String model;
        final Integer yearOfProduction;

    public Device(Producent producer, String model, Integer yearOfProduction)
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void turnOn();

