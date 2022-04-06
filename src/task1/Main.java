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
        Driver driver1 = new Driver("Bush",25);
        Driver driver2 = new Driver("Zahid",45);

        Swimmable[] people ={sportsman1,sportsman2,programmer1,programmer2,seaman1,seaman2};

        Pool pool = new Pool();
        pool.setPeople(people);
        System.out.println(pool);

        Car car1 = new Car("Tesla");
        Car car2 = new Car("Honda");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("Mercedes");

        sellingProcess(driver1,car1);
        System.out.println(driver1);

    }

    static void sellingProcess(CanDrive canDrive, Car car) {
        canDrive.buyACar(car);
        car.setOwner(canDrive);

    }
}



