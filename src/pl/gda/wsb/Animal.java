package pl.gda.wsb;

public class Animal {
    final String species;
    String name;
    private Double weight;
    Human pet;

    final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    final Double DEFAULT_lion_WEIGHT = 200.0;
    final Double DEFAULT_bull_WEIGHT = 850.0;

    public Animal(String species, String name){
        this.species = species;
        this.name = name;
        if(this.species.equals("mouse"))
            this.weight = DEFAULT_MOUSE_WEIGHT;
        else if (this.species.equals("lion"))
            this.weight = DEFAULT_lion_WEIGHT;
        else if (this.species.equals("bull"))
            this.weight = DEFAULT_bull_WEIGHT;
    }
    public Double getWeight(){
        return weight;
    }
    void  feed(){
        if (weight <=0){
            System.out.println(this.species + " -->To late :(");
        }else {
            weight++;
            System.out.println(this.species + " --> thx :) my weight is now " + this.weight);
        }
    }
    void  takeForAwalk(){
        weight--;
        if (weight <= 0){
            System.out.println(this.species + " --> No You can't fo for a walk with a dead animal");
        }else  if (weight <= 3){
            System.out.println(this.species + " --> Yeaah :) but I am hungry...");
        }else{
            System.out.println(this.species + " --> Thx for the walk brooo, my weight is now: " + this.weight);
        }
    }
    @Override
    public String toString(){
        return "Animal: " +
                "Gatunek: " + species +
                " Nazwa: "+ name +
                " Waga: "+ weight;
    }
}
