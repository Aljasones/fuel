import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consumption = new Scanner (System.in);
        System.out.println("Enter average fuel consumption in 100 km");
        double fuelConsuption = consumption.nextDouble(); //average fuel consumption
        System.out.println("Your average fuel consumption of " + fuelConsuption + " liters on 100 km");

        Scanner volume = new Scanner(System.in);
        System.out.println("Enter the amount of fuel");
        double fuelVolume = volume.nextDouble();//fuel remaining
        System.out.println("Your amount of fuel is " + fuelVolume + " liters");

        double distance = fuelVolume / fuelConsuption;
        int roundedDistance = (int) distance;
        System.out.println("The distance you can drive is " + roundedDistance + " km");

    }
}
