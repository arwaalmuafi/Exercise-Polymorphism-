import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();
        boolean running = true;

        int choice;
        do {
            System.out.println("_______________________");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.println("_______________________");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = input.next();
                    System.out.print("Enter Rental Days: ");
                    int carDays = input.nextInt();
                    Vehicle car = new Car(carModel, carDays);
                    rentedVehicles.add(car);
                    car.displayDetails();
                    break;
                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = input.next();
                    System.out.print("Enter Rental Hours: ");
                    double bikeHours = input.nextInt();
                    Vehicle bike = new Bake(bikeBrand, bikeHours);
                    rentedVehicles.add(bike);
                    bike.displayDetails();
                    break;
                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = input.next();
                    System.out.print("Enter Rental Weeks: ");
                    int truckWeeks = input.nextInt();
                    Vehicle truck = new Truck(truckType, truckWeeks);
                    rentedVehicles.add(truck);
                    truck.displayDetails();
                    break;
                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);


    }
}