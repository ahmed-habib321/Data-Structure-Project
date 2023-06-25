package hotel.Sector;

/**
 *
 * @author Ahmed
 */
/**
 * The BusinessCenter class represents a business center sector in the hotel.
 */
public class BusinessCenter extends Sector {

    private int numberOfOffices;

    /**
     * Retrieves the number of offices in the business center.
     *
     * @return The number of offices in the business center.
     */
    public int getNumberOfOffices() {
        return numberOfOffices;
    }

    /**
     * Sets the number of offices in the business center.
     *
     * @param numberOfOffices The number of offices in the business center.
     */
    public void setNumberOfOffices(int numberOfOffices) {
        this.numberOfOffices = numberOfOffices;
    }

    /**
     * Default constructor for the BusinessCenter class.
     */
    public BusinessCenter() {
    }

    /**
     * Parameterized constructor for the BusinessCenter class.
     *
     * @param numberOfOffices The number of offices in the business center.
     * @param managerName The name of the business center manager.
     * @param staffNumber The number of staff members in the business center.
     */
    public BusinessCenter(int numberOfOffices, String managerName, int staffNumber) {
        super(managerName, staffNumber);
        this.numberOfOffices = numberOfOffices;
    }

    /**
     * Returns a string representation of the business center.
     *
     * @return A string representation of the business center, including
     * manager's name, staff number, and number of offices.
     */
    @Override
    public String toString() {
        return "Business Center{" + super.toString() + ", Number of Offices: " + numberOfOffices + "}";
    }

}
