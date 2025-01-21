/**
 * Represents a car with a plate number and owner's name.
 */
public class Car {

    private String plateNumber;
    private String ownerName;

    /**
     * Constructor for the Car class.
     * @param plateNumber the car's plate number
     * @param ownerName the name of the car's owner
     */
    public Car(String plateNumber, String ownerName) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
    }

    /**
     * Gets the car's plate number.
     * @return the plate number
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * Gets the car owner's name.
     * @return the owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return"Car[Plate Number: " + plateNumber + ", Owner: " + ownerName + "]";
    }

}
