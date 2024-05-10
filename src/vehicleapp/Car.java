package vehicleapp;

import java.util.Scanner;

public class Car extends Vehicle {
    public int fuelCapacity;
    Scanner sc = new Scanner(System.in);

    public int addFuel(int addLitr) {
        int template = 0;
        template += addLitr;
        if (template <= fuelCapacity) {
            millage += addLitr;
            return millage;

        } else {
            template = 0;
            System.out.println("Elave etdiyiniz litr Capacity.ni ashir");
            return addFuel(new Scanner(System.in).nextInt());
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelCapacity=" + fuelCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", millage=" + millage +
                '}';
    }
}

