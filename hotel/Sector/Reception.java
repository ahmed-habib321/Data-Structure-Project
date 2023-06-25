package hotel.Sector;

/**
 *
 * @author Ahmed
 */
/**
 * The Reception class represents a reception sector in the hotel.
 */
public class Reception extends Sector {

    private int capacity;

    /**
     * Retrieves the capacity of the reception sector.
     *
     * @return The capacity of the reception sector.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the reception sector.
     *
     * @param capacity The capacity of the reception sector.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Default constructor for the Reception class.
     */
    public Reception() {
    }

    /**
     * Parameterized constructor for the Reception class.
     *
     * @param capacity The capacity of the reception sector.
     * @param managerName The name of the sector manager.
     * @param staffNumber The number of staff members in the sector.
     */
    public Reception(int capacity, String managerName, int staffNumber) {
        super(managerName, staffNumber);
        this.capacity = capacity;
    }

    /**
     * Returns a string representation of the reception sector.
     *
     * @return A string representation of the reception sector, including the
     * manager's name, staff number, and capacity.
     */
    @Override
    public String toString() {
        return "Reception { " + super.toString() + ", capacity = " + capacity + " }";
    }

}
