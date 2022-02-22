package task1.person;

import task1.CanDrive;
import task1.Swimmable;
import task1.person.Person;

public class Programmer extends Person implements Swimmable, CanDrive {

    private String programmingLanguage;

    public Programmer() {
    }

    public Programmer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Programmer(String name, int age, String programmingLanguage) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void eat() {
        System.out.println("Programmer is eating");
    }

    @Override
    public void drive() {
        System.out.println("Programmer is driving");
    }

    @Override
    public void swim() {
        System.out.println("Programmer is swimming");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "} " + super.toString();
    }
}
