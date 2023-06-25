package hotel.Person;

/**
 *
 * @author Ahmed
 */
/**
 * The Guest class represents a guest who stays in a hotel.
 */
public class Guest extends Person {

    private int roomNumber;
    private double bill;
    private int nights;

    /**
     * Retrieves the room number of the guest.
     *
     * @return the room number of the guest
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the room number of the guest.
     *
     * @param roomNumber the room number of the guest
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Retrieves the number of nights the guest has stayed.
     *
     * @return the number of nights the guest has stayed
     */
    public int getNights() {
        return nights;
    }

    /**
     * Sets the number of nights the guest has stayed.
     *
     * @param nights the number of nights the guest has stayed
     */
    public void setNights(int nights) {
        this.nights = nights;
    }

    /**
     * Default constructor for the Guest class.
     */
    public Guest() {
    }

    /**
     * Constructs a Guest object with the provided information.
     *
     * @param roomNumber the room number of the guest
     * @param nights the number of nights the guest has stayed
     * @param name the name of the guest
     * @param id the ID of the guest
     * @param age the age of the guest
     * @param phoneNumber the phone number of the guest
     * @param email the email address of the guest
     */
    public Guest(int roomNumber, int nights, String name, int id, int age, String phoneNumber, String email) {
        super(name, id, age, phoneNumber, email);
        this.roomNumber = roomNumber;
        this.nights = nights;
    }

    /**
     * Retrieves the bill amount for the guest.
     *
     * @return the bill amount for the guest
     */
    public double getBill() {
        return bill;
    }

    /**
     * Sets the bill amount for the guest based on the nightly rate and number
     * of nights stayed.
     *
     * @param nightlyRate the nightly rate for the guest's stay
     */
    public void setBill(double nightlyRate) {
        this.bill = nightlyRate * nights;
    }

    /**
     * Returns a string representation of the Guest object.
     *
     * @return a string representation of the Guest object
     */
    @Override
    public String toString() {
        return "Guest {" + super.toString()
                + ", Room Number: " + roomNumber
                + ", Bill: " + bill
                + ", Nights: " + nights
                + "}";
    }

}
