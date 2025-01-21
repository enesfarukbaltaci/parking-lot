/**
 * Represents a car with a plate number and owner's name.
 */
public class Car {

    private String plateNumber;
    private String ownerName;

    /**
     * Constructor for the Car class.
     * @param registrationNumber the car's registration number
     * @param ownerName the name of the car's owner
     */
    public Car(String registrationNumber, String ownerName) {
        this.plateNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    /**
     * Gets the car's registration number.
     * @return the registration number
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
        return"Car[Reg: " + plateNumber + ", Owner: " + ownerName + "]";
    }

}
