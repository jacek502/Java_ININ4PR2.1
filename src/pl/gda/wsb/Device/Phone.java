package pl.gda.wsb.Device;

import pl.gda.wsb.Producent;

public class Phone {
    String producent;
    String model;
    Double rozdzielczosc;

    public Phone(String producent, String model, double rozdzielczosc){
        this.producent = producent;
        this.model = model;
        this.rozdzielczosc = rozdzielczosc;
    }
    @Override
    public  void turnOn(){
        System
    }
    @Override
    public String toString(){
        return "Phone: " +
                producent +
                " model: " +
                model +
                " rozdzielczość: " +
                rozdzielczosc;
    }
}
