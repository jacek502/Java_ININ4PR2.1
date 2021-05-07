package pl.gda.wsb;

public class Car {
    String model;
    String producer;
    String paliwo;
    Human car;

    public Car(String model, String producer, String paliwo){
        this.model = model;
        this.producer = producer;
        this.paliwo = paliwo;
    }
    @Override
    public String toString(){
        return "Car: " +
                model +
                " Producent: " +
                producer +
                " Paliwo: " +
                paliwo;
    }

}
