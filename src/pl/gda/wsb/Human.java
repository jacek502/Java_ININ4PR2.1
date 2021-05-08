package pl.gda.wsb;

import pl.gda.wsb.Device.Car;

import java.util.Date;
import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    String position;
    private Double salary;
    private Car car;
    Animal pet;


    public Human(String firstName, String lastName, String position){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;

    }
    public Double getSalary(){
        System.out.println(new Date() + "jsajdaklsdhanl" + this.lastName);
        return salary;
    }

    public void setSalary(Double newSalary){
        if(newSalary < 0){
            System.out.println("huehuehue nikt nie będzie dawał ze swoich");
        }
    }

    public void getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.salary > car.getValue()) {
            System.out.println(("Kupiłeś auto za gelt" + car.toString()));
            this.car = car;
        }else if(this.salary > 0.83* car.getValue()){
            System.out.println("Kupiłeś za gotówke" + car.toString());
            this.car = car;
        }else System.out.println("sorry musisz zarobić więcej");
    }

    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if (!(o instanceof Human))return false;
        Human human = (Human) o;
        return  Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(position, human.position) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(car, human.car);
    }
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, position, pet, car);
    }
    @Override
    public String toString(){
        return "Human: " +
                firstName +
                "" + lastName +
                " Position: " + position ;
    }


}
