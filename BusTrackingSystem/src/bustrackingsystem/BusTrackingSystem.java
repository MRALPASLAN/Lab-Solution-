
package bustrackingsystem;

import java.util.Scanner;

public class BusTrackingSystem {

  
    public static void main(String[] args) {
       
   Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of stops: ");
        int numStops = scanner.nextInt();
        scanner.nextLine(); 

        String[] stopNames = new String[numStops];
        int[] boarding = new int[numStops];
        int[] alighting = new int[numStops];

        for (int i = 0; i < numStops; i++) {
            System.out.println("\n--- Stop " + (i + 1) + " Information Input ---");
            System.out.print("Stop name: ");
            stopNames[i] = scanner.nextLine();

            System.out.print("Boarding count: ");
            boarding[i] = scanner.nextInt();

            System.out.print("Alighting count: ");
            alighting[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.print("\nEnter bus seating capacity: ");
        int capacity = scanner.nextInt();

        
        for (int i = 0; i < numStops; i++) {
            System.out.println("\n--- " + (i + 1) + ". Stop Information ---");
            System.out.println("Stop name: " + stopNames[i]);
            System.out.println("Boarding count: " + boarding[i]);
            System.out.println("Alighting count: " + alighting[i]);
        }

     
        int[] occupancies = new int[numStops];
        int currentPassengers = 0;
        int overCapacityCount = 0;

        System.out.println("\n=============================================");
        System.out.println("ROUTE PROCESS AND WARNINGS");
        System.out.println("=============================================");

        for (int i = 0; i < numStops; i++) {
            currentPassengers += boarding[i];

            if (currentPassengers - alighting[i] < 0) {
                System.out.println("Data error at [" + stopNames[i] + "]: cannot have more passengers alighting than are currently on the bus. Occupancy set to 0.");
                currentPassengers = 0;
            } else {
                currentPassengers -= alighting[i];
            }

            occupancies[i] = currentPassengers;
            System.out.println("[" + stopNames[i] + "] Current passengers after stop: " + currentPassengers);

            if (currentPassengers > capacity) {
                System.out.println("Warning: Bus is over capacity at [" + stopNames[i] + "]! (Passengers: " + currentPassengers + ", Capacity: " + capacity + ")");
                overCapacityCount++;
            }
        }

        
        System.out.println("\n=============================================================");
        System.out.printf("%-25s %-12s %-12s %-15s%n", "Stop Name", "Boarding", "Alighting", "Current Occupancy");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < numStops; i++) {
            System.out.printf("%-25s %-12d %-12d %-15d%n", stopNames[i], boarding[i], alighting[i], occupancies[i]);
        }
        System.out.println("=============================================================");

        
        int maxBoarding = boarding[0];
        int busiestStopIndex = 0;
        int totalOccupancy = 0;

        for (int i = 0; i < numStops; i++) {
            if (boarding[i] > maxBoarding) {
                maxBoarding = boarding[i];
                busiestStopIndex = i;
            }
            totalOccupancy += occupancies[i];
        }

        double averageOccupancy = (double) totalOccupancy / numStops;
        int finalOccupancy = occupancies[numStops - 1];

        System.out.println("\n=============================================");
        System.out.println("STATISTICS");
        System.out.println("=============================================");
        System.out.println("Busiest stop: " + stopNames[busiestStopIndex] + " (" + maxBoarding + " passengers boarding)");
        System.out.printf("Average bus occupancy: %.2f%n", averageOccupancy);
        System.out.println("Stops exceeding capacity: " + overCapacityCount);
        System.out.println("Final occupancy: " + finalOccupancy);

        if (finalOccupancy != 0) {
            System.out.println("Warning: Bus is not empty at the end of the route!");
        }

        scanner.close();
    }
}