package task1.person;

import task1.CanDrive;
import task1.person.Person;

public class Driver extends Person implements CanDrive {

    private String carModel;

    public Driver() {
    }

    public Driver(String carModel) {
        this.carModel = carModel;
    }

    public Driver(String name, int age, String carModel) {
        super(name, age);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
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
        return "Driver{" +
                "carModel='" + carModel + '\'' +
                "} " + super.toString();
    }
}
