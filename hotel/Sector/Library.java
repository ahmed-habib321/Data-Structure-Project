package hotel.Sector;

/**
 *
 * @author Ahmed
 */
/**
 * The Library class represents a library sector in the hotel.
 */
public class Library extends Sector {

    private int numberOfBooks;
    private int capacity;

    /**
     * Retrieves the number of books in the library.
     *
     * @return The number of books in the library.
     */
    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    /**
     * Sets the number of books in the library.
     *
     * @param numberOfBooks The number of books in the library.
     */
    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    /**
     * Retrieves the capacity of the library.
     *
     * @return The capacity of the library.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the library.
     *
     * @param capacity The capacity of the library.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Default constructor for the Library class.
     */
    public Library() {
    }

    /**
     * Parameterized constructor for the Library class.
     *
     * @param numberOfBooks The number of books in the library.
     * @param capacity The capacity of the library.
     * @param managerName The name of the library sector manager.
     * @param staffNumber The number of staff members in the library sector.
     */
    public Library(int numberOfBooks, int capacity, String managerName, int staffNumber) {
        super(managerName, staffNumber);
        this.numberOfBooks = numberOfBooks;
        this.capacity = capacity;
    }

    /**
     * Returns a string representation of the library sector.
     *
     * @return A string representation of the library sector, including the
     * manager's name, staff number, number of books, and capacity.
     */
    @Override
    public String toString() {
        return "Library{" + super.toString()
                + ", number of books=" + numberOfBooks
                + ", capacity=" + capacity
                + '}';
    }

}
