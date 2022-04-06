package task1.person;

import task1.CanDrive;

public class Car {

    private String model;
    private CanDrive owner;


    public Car() {
    }

    public Car(String model) {
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CanDrive getOwner() {
        return owner;
    }

    public void setOwner(CanDrive owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car information: " +'\n'+
                "model: " + model + '\n' +
                "owner: " + ((Person)owner).getName()+'\n';
    }
}
