package pl.gda.wsb.Device;

public class Car {
    String model;
    String producer;
    String paliwo;
    private Double value;

    public Car(String model, String producer, String paliwo, Double value){
        this.model = model;
        this.producer = producer;
        this.paliwo = paliwo;
    }

    public Double getValue(Double value) {
        this.value = value;
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
