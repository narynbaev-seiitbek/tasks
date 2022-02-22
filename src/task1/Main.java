package task1;

import task1.person.*;

public class Main {

    public static void main(String[] args) {


        Programmer programmer1 = new Programmer("Jack",36,"Java");
        Programmer programmer2 = new Programmer("Azat",46,"Java Script");
        Sportsman sportsman1 = new Sportsman("Bill",18,"Football");
        Sportsman sportsman2 = new Sportsman("Islam",28,"Basketball");
        Seaman seaman1 = new Seaman("Piter",42,76.5);
        Seaman seaman2 = new Seaman("Tologon",32,24);
        Driver driver1 = new Driver("Bush",25,"Mercedes");
        Driver driver2 = new Driver("Zahid",45,"Honda");

        Pool pool = new Pool();

        pool.setPeople(new Person[]{sportsman1,sportsman2,programmer1,programmer2,seaman1,seaman2});

        System.out.println(pool);




    }
}



