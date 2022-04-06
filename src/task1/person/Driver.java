package task1.person;

import task1.CanDrive;
import task1.person.Person;

public class Driver extends Person implements CanDrive {

    private Car car;

    public Driver() {
    }


    public Driver(String name, int age) {
        super(name, age);

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void buyACar(Car car) {
        this.car = car;
    }

    @Override
    void eat() {
        System.out.println("Driver is eating");
    }

    @Override
    public void drive() {
        System.out.println("Driver is driving");
    }

    @Override
    public String toString() {
        return "Driver: " +'\n'+
                "car: " + car +'\n'+
                 super.toString();
    }
}
