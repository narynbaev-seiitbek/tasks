package task1.person;

import task1.CanDrive;
import task1.Swimmable;
import task1.person.Person;

public class Sportsman extends Person implements Swimmable, CanDrive {

    private String kindOfSport;

    public Sportsman() {
    }

    public Sportsman(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public Sportsman(String name, int age, String kindOfSport) {
        super(name, age);
        this.kindOfSport = kindOfSport;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    @Override
    void eat() {
        System.out.println("Sportsman is eating");
    }

    @Override
    public void drive() {
        System.out.println("Sportsman is driving");
    }

    @Override
    public void swim() {
        System.out.println("Sportsman is swimming");
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "kindOfSport='" + kindOfSport + '\'' +
                "} " + super.toString();
    }
}
