package pl.gda.wsb;

public class Dog {
    String rasa;
    String imie;
    String waga;

    public Dog(String rasa, String imie, String waga){
        this.rasa = rasa;
        this.imie = imie;
        this.waga = waga;
    }
    @Override
    public String toString(){
        return "Dog: " +
                rasa +
                ' ' + imie +
                ", waga " + waga;
    }
}
