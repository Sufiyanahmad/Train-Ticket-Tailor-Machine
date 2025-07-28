import java.util.Scanner;

public class TrainTicketMachine {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==== Welcome to Train Ticket Tailor Machine ====");

        while (true) {
            System.out.print("\nEnter Passenger Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            System.out.println("Choose Destination:");
            System.out.println("1. Delhi (200 km)");
            System.out.println("2. Mumbai (400 km)");
            System.out.println("3. Kolkata (800 km)");
            System.out.print("Enter choice: ");
            int destinationChoice = scanner.nextInt();
            scanner.nextLine();

            int distance = 0;
            String destination = "";

            switch (destinationChoice) {
                case 1: destination = "Delhi"; distance = 200; break;
                case 2: destination = "Mumbai"; distance = 400; break;
                case 3: destination = "Kolkata"; distance = 800; break;
                default: System.out.println("Invalid choice!"); continue;
            }

            System.out.println("Choose Class:");
            System.out.println("1. General (Rs. 1/km)");
            System.out.println("2. Sleeper (Rs. 2/km)");
            System.out.println("3. AC (Rs. 3/km)");
            System.out.print("Enter class choice: ");
            int classChoice = scanner.nextInt();
            scanner.nextLine();

            int ratePerKm = 0;
            String trainClass = "";

            switch (classChoice) {
                case 1: trainClass = "General"; ratePerKm = 1; break;
                case 2: trainClass = "Sleeper"; ratePerKm = 2; break;
                case 3: trainClass = "AC"; ratePerKm = 3; break;
                default: System.out.println("Invalid class!"); continue;
            }

            int totalFare = ratePerKm * distance;

            // Print Ticket
            System.out.println("\n===== Train Ticket =====");
            System.out.println("Passenger: " + name);
            System.out.println("Age: " + age);
            System.out.println("Destination: " + destination + " (" + distance + " km)");
            System.out.println("Class: " + trainClass);
            System.out.println("Fare: Rs. " + totalFare);
            System.out.println("========================\n");

            System.out.print("Do you want to book another ticket? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Thank you for using Train Ticket Tailor Machine!");
                break;
            }
        }
    }
}
