package hotel.Sector;

/**
 *
 * @author Ahmed
 */
/**
 * The Sector class represents abstract sector in the hotel.
 */
public abstract class Sector {

    private String managerName;
    private int staffNumber;

    /**
     * Default constructor for the Sector class.
     */
    public Sector() {
    }

    /**
     * Parameterized constructor for the Sector class.
     *
     * @param managerName The name of the sector manager.
     * @param staffNumber The number of staff members in the sector.
     */
    public Sector(String managerName, int staffNumber) {
        this.managerName = managerName;
        this.staffNumber = staffNumber;
    }

    /**
     * Retrieves the name of the sector manager.
     *
     * @return The name of the sector manager.
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Sets the name of the sector manager.
     *
     * @param managerName The name of the sector manager.
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    /**
     * Retrieves the number of staff members in the sector.
     *
     * @return The number of staff members in the sector.
     */
    public int getStaffNumber() {
        return staffNumber;
    }

    /**
     * Sets the number of staff members in the sector.
     *
     * @param staffNumber The number of staff members in the sector.
     */
    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    /**
     * Returns a string representation of the sector.
     *
     * @return A string representation of the sector, including the manager's
     * name and staff number.
     */
    @Override
    public String toString() {
        return "Manager name: " + managerName + ", Staff number: " + staffNumber;
    }
}
