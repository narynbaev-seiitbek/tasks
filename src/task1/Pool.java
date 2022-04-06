package task1;

import task1.person.Person;

import java.util.Arrays;

public class Pool {

    Swimmable[] people;

    public Pool() {
    }

    public Pool(Swimmable[] people) {
        this.people = people;
    }

    public Swimmable[] getPeople() {
        return people;
    }

    public void setPeople(Swimmable[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Pool information:" +'\n'+
                "people=" + Arrays.toString(people)+'\n';
    }
}
