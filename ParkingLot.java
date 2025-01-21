/**
 * Manages a parking lot with multiple levels and slots.
 */
public class ParkingLot {

    private final Car[][] parkingSlots; // 2D array for parking slots
    private static int totalParkedCars = 0; // Static variable to track parked cars
    private final int levels; // Number of levels
    private final int slotsPerLevel; // Slots per level

    /**
     * Constructor for the ParkingLOt class.
     * @param levels number of levels in the parking lot
     * @param slotsPerLevel number of slots per level
     */
    public ParkingLot(int levels, int slotsPerLevel) {
        this.levels = levels;
        this.slotsPerLevel = slotsPerLevel;
        parkingSlots = new Car[levels][slotsPerLevel];
    }

    /**
     * Parks a car in the first available slot
     *
     * @param car the car to be parked
     * @return true if the car was parked successfully, false otherwise
     */
    public boolean parkCar(Car car) {
        for (int i = 0; i < levels; i++) {
            for (int j = 0; j < slotsPerLevel; j++) {
                if (parkingSlots[i][j] == null) { // Empty slot found
                    parkingSlots[i][j] = car;
                    totalParkedCars++;
                    System.out.println("Car parked at Level " + (i + 1) + ", Slot " + (j + 1));
                    return true;
                }
            }
        }
    System.out.println("Parking Lot Full!");
    return false;
    }

    /**
     * Retrieves a car by its registration number.
     * @param plateNumber the plate number of the car to retrieve
     * @return true if the car was retrieved successfully, false otherwise
     */
    public boolean retrieveCar(String plateNumber) {
        for (int i=0; i < levels; i++) {
            for (int j=0; j < slotsPerLevel; j++) {
                if (parkingSlots[i][j] != null &&
                        parkingSlots[i][j].getPlateNumber().equals(plateNumber)) {
                    System.out.println("Car retrieved from Level " + (i + 1) + ", Slot " + (j + 1));
                    parkingSlots[i][j] = null; // Empty the slot
                    totalParkedCars--;
                    return true;
                }
            }
        }
        System.out.println("Car not found!");
        return false;
    }

    /**
     * Display the current parking lot status
     */
    public void viewParkingLotStatus() {
        System.out.println("Parking Lot Status:");
        for (int i=0; i < levels; i++) {
            System.out.print("Level " + (i + 1) + ": ");
            for (int j=0; j < slotsPerLevel; j++) {
                if (parkingSlots[i][j] == null) {
                    System.out.print("[Empty] ");
                } else {
                    System.out.print("[" + parkingSlots[i][j].getPlateNumber() + "] ");
                }
            }
            System.out.println();
        }
        System.out.println("Total Parked Cars: " + totalParkedCars);
    }


}
