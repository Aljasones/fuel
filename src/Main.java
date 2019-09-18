import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter average fuel consumption in 100 km");
        double fuelConsuption = scanner.nextDouble(); //average fuel consumption
        System.out.println("Your average fuel consumption of " + fuelConsuption + " liters on 100 km");
        double fuelConsuptionOnOneKm = fuelConsuption / 100; //fuel consumption in 1 kilometer

        System.out.println("Enter the amount of fuel");
        double fuelVolume = scanner.nextDouble();//fuel remaining
        System.out.println("Your amount of fuel is " + fuelVolume + " liters");

        double distance = fuelVolume / fuelConsuptionOnOneKm;
        int roundedDistance = (int) distance;
        System.out.println("The distance you can drive is " + roundedDistance + " km");
        scanner.close();

    }
}
