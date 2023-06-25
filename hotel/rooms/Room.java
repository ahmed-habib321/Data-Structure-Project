package hotel.rooms;

/**
 *
 * @author Ahmed
 *
 */
public class Room {

    private int roomNumber;
    private int nightPrice;
    private boolean isBooked;

    /**
     * Constructs a new Room object. The room is initially not booked.
     */
    public Room() {
        this.isBooked = false;
    }

    /**
     * Constructs a new Room object with the specified room number and night
     * price. The room is initially not booked.
     *
     * @param roomNumber the room number
     * @param nightPrice the price per night for the room
     */
    public Room(int roomNumber, int nightPrice) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
        this.nightPrice = nightPrice;
    }

    /**
     * Returns the room number.
     *
     * @return the room number
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the room number.
     *
     * @param roomNumber the room number to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * Returns the night price for the room.
     *
     * @return the night price for the room
     */
    public int getNightPrice() {
        return nightPrice;
    }

    /**
     * Sets the night price for the room.
     *
     * @param nightPrice the night price to set
     */
    public void setNightPrice(int nightPrice) {
        this.nightPrice = nightPrice;
    }

    /**
     * Checks if the room is booked.
     *
     * @return true if the room is booked, false otherwise
     */
    public boolean isBooked() {
        return isBooked;
    }

    /**
     * Sets the booked status of the room.
     *
     * @param booked true to set the room as booked, false to set it as not
     * booked
     */
    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    /**
     * Returns a string representation of the Room object.
     *
     * @return a string representation of the Room
     */
    @Override
    public String toString() {
        return "Room{"
                + "roomNumber=" + roomNumber
                + ", nightPrice=" + nightPrice
                + ", isBooked=" + isBooked
                + '}';
    }

}
