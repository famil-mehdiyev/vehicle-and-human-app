package humanapp;

import java.util.Scanner;

public class Employee extends Human {
    static Employee[] employeesArr = new Employee[new Scanner(System.in).nextInt()];

    public int salary;
    public String position;

    public Employee(String fullName, int age, int salary, String position) {
        super(fullName, age);
        this.salary = salary;
        this.position = position;
    }

    public static void addEmployees() {


        for (int i = 0; i < employeesArr.length; i++) {
            System.out.println("Employeenin ad ve soyadini  daxil edin");
            String fullName = new Scanner(System.in).nextLine();

            System.out.println("Ishcinin yashini daxil edin");
            int age = new Scanner(System.in).nextInt();

            System.out.println("Ishcinin maashini daxil edin");
            int salary = new Scanner(System.in).nextInt();

            System.out.println("position dail edin :");
            String position = new Scanner(System.in).nextLine();

            employeesArr[i] = new Employee(fullName, age, salary, position);
        }

    }

    public static void findEmployees() {
        System.out.println("""
                1 - Filtrlenmiw  Employee.ni goster :
                2 - Butun Employeeleri goster :
                """);
        int operation = new Scanner(System.in).nextInt();
        switch (operation) {
            case 1:
                System.out.println("Axtarmaq istediyiniz fullname.i daxil edin :");
                String filtredFullName = new Scanner(System.in).nextLine();
                for (int i = 0; i < employeesArr.length; i++) {
                    if (filtredFullName.equalsIgnoreCase(employeesArr[i].fullName)) {
                        System.out.println(employeesArr[i].toString());
                    }
                }
                break;
            case 2:
                for (int i = 0; i < employeesArr.length; i++) {
                    System.out.println(employeesArr[i].toString());
                }

                break;

            default:
                System.out.println("duzgun daxil edin :");
        }
    }


    @Override
    public String toString() {
        return "Employee{" +
                ", fullName='" + fullName + '\'' +
                "salary=" + salary +
                ", position='" + position + '\'' +

                ", age=" + age +
                '}';
    }
}
