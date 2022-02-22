package task1;

import task1.person.Person;

import java.util.Arrays;

public class Pool {

    Person[] people;

    public Pool() {
    }

    public Pool(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Pool{" +'\n'+
                "people=" + Arrays.toString(people) +'\n'+
                '}';
    }
}
