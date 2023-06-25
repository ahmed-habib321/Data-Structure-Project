package hotel.Sector;

import java.util.Arrays;

/**
 *
 * @author Ahmed
 */
/**
 * The Restaurant class represents a restaurant sector in the hotel.
 */
public class Restaurant extends Sector {

    private int bookingPrice;
    private String[] menu;

    /**
     * Retrieves the booking price for the restaurant.
     *
     * @return The booking price for the restaurant.
     */
    public int getBookingPrice() {
        return bookingPrice;
    }

    /**
     * Sets the booking price for the restaurant.
     *
     * @param bookingPrice The booking price for the restaurant.
     */
    public void setBookingPrice(int bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    /**
     * Retrieves the menu for the restaurant.
     *
     * @return The menu for the restaurant as an array of strings.
     */
    public String[] getMenu() {
        return menu;
    }

    /**
     * Default constructor for the Restaurant class.
     */
    public Restaurant() {
    }

    /**
     * Parameterized constructor for the Restaurant class.
     *
     * @param bookingPrice The booking price for the restaurant.
     * @param menu The menu for the restaurant as an array of strings.
     * @param managerName The name of the restaurant sector manager.
     * @param staffNumber The number of staff members in the restaurant sector.
     */
    public Restaurant(int bookingPrice, String[] menu, String managerName, int staffNumber) {
        super(managerName, staffNumber);
        this.bookingPrice = bookingPrice;
        this.menu = menu;
    }

    /**
     * Returns a string representation of the restaurant sector.
     *
     * @return A string representation of the restaurant sector, including
     * manager's name, staff number, booking price, and menu.
     */
    @Override
    public String toString() {
        return "Restaurant { " + super.toString() + " , Booking price: " + bookingPrice + " , Menu: " + Arrays.toString(menu) + " }";
    }

}
