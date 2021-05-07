package pl.gda.wsb;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Jan", " Nowak", "Java Developer");
        Human human2 = new Human("Marek", "Layers", "C# Developer");
        Human human3 = new Human("Dominik", "Saylor", "Python Developer");
        Human human4 = new Human("Jan", " Nowak", "Java Developer");

        Animal animal1 = new Animal("mouse", "Moki");
        Animal animal2 = new Animal("lion", "Lisa");

        Dog dog1 = new Dog("Huskey", "Ciapek", "40kg");
        Dog dog2 = new Dog("Labrador", "Lira", "60kg");

        Car car1 = new Car("Mercedes-Benz AMG", "Mark-Benz", "Ropa(Diesel)");
        Car car2 = new Car("Maybach", "Menel", "Benzyna");

        Phone phone1 = new Phone("Samsung", "J3",5.0);
        Phone phone2 = new Phone("Nokia", "3310",1.0);

        System.out.println(human1);
        System.out.println("Human: " + human1.firstName + "" + human1.lastName + "position" + human1.position);

        if (animal1.getWeight() > animal2.getWeight())
            System.out.println("Cięższy jest " + animal1.name + ". Jego waga: " + animal1.getWeight());
        else System.out.println("Cięższy jest " + animal2.name + ". Jego waga: " + animal2.getWeight());

        System.out.println("\n.......................\n");

        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(human1);
        humansList.add(human2);
        humansList.add(human3);

        for (Human human : humansList){
            System.out.println(human.lastName);
        }

        System.out.println("\n...................\n");

        animal1.feed();
        animal1.takeForAwalk();

        human1.pet = animal1;
        human1.car = car1;

        System.out.println(human1.firstName + "" + human1.lastName + " have\ncar" + " " + car1.model + " " + car1.producer + " " + car1.paliwo + " " + "\npet: " );

        System.out.println("\n...................\n");

        System.out.println("Wynik porównania: " + human1.equals(human4));

        System.out.println(human1);
        System.out.println(animal1);
        System.out.println(phone1);
        System.out.println(car1);

    }
}
