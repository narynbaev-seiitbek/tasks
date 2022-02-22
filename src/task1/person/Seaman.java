package task1.person;

import task1.Swimmable;
import task1.person.Person;

public class Seaman extends Person implements Swimmable {

    private double weight;

    public Seaman() {
    }

    public Seaman(double weight) {
        this.weight = weight;
    }

    public Seaman(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    void eat() {
        System.out.println("Seaman is eating");
    }

    @Override
    public void swim() {
        System.out.println("Seaman is swimming");
    }

    @Override
    public String toString() {
        return "Seaman{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
