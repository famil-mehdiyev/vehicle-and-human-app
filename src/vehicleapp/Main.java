package vehicleapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand="BMW";
        car.model ="F30";
        car.millage=0;
        car.fuelCapacity=60;
        System.out.println(car.toString());
        System.out.println("Elave edin");
        car.addFuel(new Scanner(System.in).nextInt());
        System.out.println(car.toString());
    }
}
