import java.util.Scanner;

public class ParkingLotRunner {
    public static void main(String[] args) {

        final int LEVELS = 2; // Number of levels
        final int SLOTS_PER_LEVEL = 3; // Slots per level

        ParkingLot parkingLot = new ParkingLot(LEVELS,SLOTS_PER_LEVEL);
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean continueOperations;

        do {
            System.out.println("===Welcome to the Parking Lot!===");
            System.out.println("1. Park a car");
            System.out.println("2. Retrieve a car");
            System.out.println("3. View a parking lot status");
            System.out.println("4. Exit");
            System.out.print("Please select what you want : ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline from the buffer

            switch (choice){
                case 1 :
                    System.out.print("Enter Registration Number : ");
                    String plateNumber = scanner.nextLine();
                    System.out.print("Enter Owner Name : ");
                    String ownerName = scanner.nextLine();
                    Car car = new Car(plateNumber, ownerName);
                    parkingLot.parkCar(car);
                    break;
                case 2 :
                    System.out.print("Enter Registration Number to Retrieve");
                    String plateNumToRetrieve = scanner.nextLine();
                    parkingLot.retrieveCar(plateNumToRetrieve);
                    break;
                case 3 :
                    parkingLot.viewParkingLotStatus();
                    break;
                case 4 :
                    System.out.println("Exiting.. Thank you!");
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            continueOperations = askToContinue(scanner);

        }while (continueOperations);

        scanner.close();
    }

    /**
     * Asks the user if they want to continue or no. Ensures the user enters a valid response(Y/N)
     * @param scanner The scanner object for user input
     * @return true if the user wants to continue, false otherwise
     */
    private static boolean askToContinue(Scanner scanner){
        while(true) {
            System.out.print("\nDo you want to make another operation? (Y/N) : ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("Y")) {
                return true; // Continue the loop
            } else if (input.equals("N")) {
                System.out.println("Exiting.. Thank you!");
                return false; // Exit the loop
            } else {
                System.out.println("Invalid Input! Please enter Y or N.");
            }
        }
    }
}
