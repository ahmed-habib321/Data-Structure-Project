package hotel.Sector;

/**
 *
 * @author Ahmed
 */
/**
 * The Parking class represents a parking sector in the hotel.
 */
public class Parking extends Sector {

    private int capacity;
    private int parkingPrice;

    /**
     * Retrieves the capacity of the parking sector.
     *
     * @return The capacity of the parking sector.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the parking sector.
     *
     * @param capacity The capacity of the parking sector.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Retrieves the price of parking in the sector.
     *
     * @return The price of parking in the sector.
     */
    public int getParkingPrice() {
        return parkingPrice;
    }

    /**
     * Sets the price of parking in the sector.
     *
     * @param parkingPrice The price of parking in the sector.
     */
    public void setParkingPrice(int parkingPrice) {
        this.parkingPrice = parkingPrice;
    }

    /**
     * Default constructor for the Parking class.
     */
    public Parking() {
    }

    /**
     * Parameterized constructor for the Parking class.
     *
     * @param capacity The capacity of the parking sector.
     * @param parkingPrice The price of parking in the sector.
     * @param managerName The name of the parking sector manager.
     * @param staffNumber The number of staff members in the parking sector.
     */
    public Parking(int capacity, int parkingPrice, String managerName, int staffNumber) {
        super(managerName, staffNumber);
        this.capacity = capacity;
        this.parkingPrice = parkingPrice;
    }

    /**
     * Returns a string representation of the parking sector.
     *
     * @return A string representation of the parking sector, including the
     * manager's name, staff number, capacity, and parking price.
     */
    @Override
    public String toString() {
        return "Parking{ " + super.toString() + " , capacity = " + capacity + " , parking price = " + parkingPrice + " }";
    }

}
