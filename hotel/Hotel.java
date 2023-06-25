package hotel;

import DataHandler.*;
import hotel.Person.*;
import hotel.rooms.*;
import hotel.Sector.*;

/**
 *
 * @author elsha
 */
/**
 * Hotel class represents a hotel management system that handles guests, staff,
 * rooms, and various facilities.
 */
public class Hotel {

    private GuestsSLL guests = new GuestsSLL();
    private StaffStack staff = new StaffStack();
    private RoomsDLL rooms = new RoomsDLL();

    private Reception reception;
    private BusinessCenter businessCenter;
    private Library library;
    private Parking parking;
    private Restaurant restaurant;

    /**
     * Initializes the hotel object with initial data.
     */
    public Hotel() {
        setInitialData();
        reception = new Reception(100, "Yousef", 10);
        businessCenter = new BusinessCenter(20, "Mohammed", 10);
        library = new Library(500, 40, "Menna", 6);
        parking = new Parking(60, 5, "Ahmed", 5);
        restaurant = new Restaurant(10, new String[]{"Fish", "Meat"}, "Gamal", 20);
    }

    private void setInitialData() {
        addRoom(1, 200);
        addRoom(2, 300);
        addRoom(3, 900);
        addRoom(4, 800);
        addRoom(5, 400);
        addRoom(6, 200);
        addRoom(7, 100);
        addRoom(8, 300);
        addRoom(9, 300);
        addRoom(10, 100);
        addRoom(11, 600);
        // Add more rooms...

        addGuest(1, 5, "ahmed", 1, 20, "1234567891", "ahmed@gmail.com");
        addGuest(2, 10, "amr", 2, 25, "1243567891", "amr@gmail.com");
        addGuest(3, 25, "mohamed", 3, 30, "1324567891", "mohamed@gmail.com");
        addGuest(4, 2, "khaled", 4, 18, "1234657891", "khaled@gmail.com");
        // Add more guests...

        addStaff(2000, 500, "0554", "s1", 1, 23, "1234657891", "s1@gmail.com");
        addStaff(3000, 100, "0254", "s2", 2, 25, "2134657891", "s2@gmail.com");
        addStaff(1500, 300, "0454", "s3", 3, 24, "3234657891", "s3@gmail.com");
        addStaff(2000, 700, "0694", "s4", 4, 30, "9834657891", "s4@gmail.com");
        addStaff(4000, 1000, "0204", "s5", 5, 27, "8234657891", "s5@gmail.com");
        addStaff(2500, 750, "0134", "s6", 6, 29, "1985657891", "s6@gmail.com");
        addStaff(2500, 750, "0134", "s7", 7, 29, "1985657891", "s6@gmail.com");
        addStaff(4000, 1000, "0204", "s8", 8, 27, "8234657891", "s5@gmail.com");
        // Add more staff...
    }

    /**
     * Sets the information of the reception.
     *
     * @param capacity The capacity of the reception.
     * @param managerName The name of the reception manager.
     * @param staffNumber The number of staff in the reception.
     */
    public void setReceptionInfo(int capacity, String managerName, int staffNumber) {
        reception.setCapacity(capacity);
        reception.setManagerName(managerName);
        reception.setStaffNumber(staffNumber);
    }

    /**
     * Sets the information of the business center.
     *
     * @param numberOfOffices The number of offices in the business center.
     * @param managerName The name of the business center manager.
     * @param staffNumber The number of staff in the business center.
     */
    public void setBusinessCenterInfo(int numberOfOffices, String managerName, int staffNumber) {
        businessCenter.setManagerName(managerName);
        businessCenter.setNumberOfOffices(numberOfOffices);
        businessCenter.setStaffNumber(staffNumber);
    }

    /**
     * Sets the information of the library.
     *
     * @param numberOfBooks The number of books in the library.
     * @param capacity The capacity of the library.
     * @param managerName The name of the library manager.
     * @param staffNumber The number of staff in the library.
     */
    public void setLibraryInfo(int numberOfBooks, int capacity, String managerName, int staffNumber) {
        library.setCapacity(capacity);
        library.setManagerName(managerName);
        library.setNumberOfBooks(numberOfBooks);
        library.setStaffNumber(staffNumber);
    }

    /**
     * Sets the information of the parking.
     *
     * @param capacity The capacity of the parking.
     * @param parkingPrice The price of parking.
     * @param managerName The name of the parking manager.
     * @param staffNumber The number of staff in the parking.
     */
    public void setParkingInfo(int capacity, int parkingPrice, String managerName, int staffNumber) {
        parking.setCapacity(capacity);
        parking.setManagerName(managerName);
        parking.setParkingPrice(parkingPrice);
        parking.setStaffNumber(staffNumber);
    }

    /**
     * Sets the information of the restaurant.
     *
     * @param bookingPrice The price of booking a table in the restaurant.
     * @param managerName The name of the restaurant manager.
     * @param staffNumber The number of staff in the restaurant.
     */
    public void setRestaurantInfo(int bookingPrice, String managerName, int staffNumber) {
        restaurant.setBookingPrice(bookingPrice);
        restaurant.setManagerName(managerName);
        restaurant.setStaffNumber(staffNumber);
    }

    /**
     * Adds a room to the hotel.
     *
     * @param roomNumber The room number.
     * @param nightPrice The price per night for the room.
     */
    public void addRoom(int roomNumber, int nightPrice) {
        Room room = new Room();
        room.setRoomNumber(roomNumber);
        room.setNightPrice(nightPrice);

        rooms.addNode(room);
    }

    /**
     * Adds a guest to the hotel.
     *
     * @param roomNumber The room number for the guest.
     * @param nights The number of nights the guest will stay.
     * @param name The name of the guest.
     * @param id The ID of the guest.
     * @param age The age of the guest.
     * @param phoneNumber The phone number of the guest.
     * @param email The email address of the guest.
     */
    public void addGuest(int roomNumber, int nights, String name, int id, int age, String phoneNumber, String email) {
        Guest guest = new Guest();

        if (!rooms.isBooked(roomNumber)) {
            guest.setRoomNumber(roomNumber);
        } else {
            System.out.println("Booking isn't done because the room is already booked.");
            return;
        }

        guest.setName(name);
        guest.setAge(age);
        guest.setId(id);
        guest.setEmail(email);
        guest.setNights(nights);
        guest.setBill(rooms.getNightPrice(roomNumber));
        guest.setPhoneNumber(phoneNumber);

        rooms.book(roomNumber);
        guests.addGuest(guest);
    }

    /**
     * Adds a staff member to the hotel.
     *
     * @param salary The salary of the staff member.
     * @param bonus The bonus amount for the staff member.
     * @param ssn The SSN (Social Security Number) of the staff member.
     * @param name The name of the staff member.
     * @param id The ID of the staff member.
     * @param age The age of the staff member.
     * @param phoneNumber The phone number of the staff member.
     * @param email The email address of the staff member.
     */
    public void addStaff(int salary, int bonus, String ssn, String name, int id, int age, String phoneNumber, String email) {
        Staff staffMember = new Staff();
        staffMember.setAge(age);
        staffMember.setBonus(bonus);
        staffMember.setEmail(email);
        staffMember.setId(id);
        staffMember.setName(name);
        staffMember.setPhoneNumber(phoneNumber);
        staffMember.setSalary(salary);
        staffMember.setSsn(ssn);

        staff.push(staffMember);
    }

    /**
     * Returns the number of guests in the hotel.
     *
     * @return The number of guests.
     */
    public int getNumberOfGuests() {
        return guests.count();
    }

    /**
     * Returns the number of staff members in the hotel.
     *
     * @return The number of staff members.
     */
    public int getNumberOfStaff() {
        return staff.count();
    }

    /**
     * Returns the number of rooms in the hotel.
     *
     * @return The number of rooms.
     */
    public int getNumberOfRooms() {
        return rooms.count();
    }

    /**
     * Returns the information of the reception.
     *
     * @return The reception information.
     */
    public String getReceptionInfo() {
        return reception.toString();
    }

    /**
     * Returns the information of the business center.
     *
     * @return The business center information.
     */
    public String getBusinessCenterInfo() {
        return businessCenter.toString();
    }

    /**
     * Returns the information of the library.
     *
     * @return The library information.
     */
    public String getLibraryInfo() {
        return library.toString();
    }

    /**
     * Returns the information of the parking.
     *
     * @return The parking information.
     */
    public String getParkingInfo() {
        return parking.toString();
    }

    /**
     * Returns the information of the restaurant.
     *
     * @return The restaurant information.
     */
    public String getRestaurantInfo() {
        return restaurant.toString();
    }

    /**
     * Returns the price per night for a specific room.
     *
     * @param roomNumber The room number.
     * @return The price per night for the room.
     */
    public int getRoomPrice(int roomNumber) {
        return rooms.getNightPrice(roomNumber);
    }

    /**
     * Displays the information of all rooms in the hotel.
     */
    public void getRoomsInfo() {
        rooms.display();
    }

    /**
     * Displays the information of all guests in the hotel.
     */
    public void getGuestsInfo() {
        guests.display();
    }

    /**
     * Displays the information of all staff members in the hotel.
     */
    private void getStaffInfo() {
        staff.display();
    }

    /**
     * Displays all information about the hotel.
     */
    public void getAllInfo() {
        System.out.println(getReceptionInfo());
        System.out.println(getBusinessCenterInfo());
        System.out.println(getLibraryInfo());
        System.out.println(getParkingInfo());
        System.out.println(getRestaurantInfo());
        getRoomsInfo();
        getStaffInfo();
        getGuestsInfo();
        System.out.println("Number of guests: " + getNumberOfGuests());
        System.out.println("Number of staff members: " + getNumberOfStaff());
        System.out.println("Number of rooms: " + getNumberOfRooms());
        System.out.println("Hotel income is " + calculateHotelIncome());
        System.out.println("Hotel outcome is " + calculateHotelOutcome());
        System.out.println("Hotel profit is " + (calculateHotelIncome() - calculateHotelOutcome()));
    }

    /**
     * Returns the list of unbooked rooms in the hotel.
     *
     * @return The list of unbooked rooms.
     */
    public String getUnbookedRooms() {
        return rooms.displayUnbooked();
    }

    /**
     * Returns the auto-generated staff number.
     *
     * @return The auto-generated staff number.
     */
    public int getStaffautoNumber() {
        return staff.getAutoNumber();
    }

    /**
     * Returns the auto-generated guest number.
     *
     * @return The auto-generated guest number.
     */
    public int getGuestautoNumber() {
        return guests.getNextAutoNumber();
    }

    /**
     * Retrieves the bill for a specific guest.
     *
     * @param guestNumber The guest number.
     * @return The bill amount for the guest.
     */
    public double getBill(int guestNumber) {
        return guests.getBill(guestNumber);
    }

    /**
     * Deletes a staff member based on their ID.
     *
     * @param id The ID of the staff member to delete.
     */
    public void deleteStaff(int id) {
        staff.deleteById(id);
    }

    /**
     * Deletes a guest based on their ID.
     *
     * @param id The ID of the guest to delete.
     */
    public void deleteGuest(int id) {
        int roomNumber = guests.getRoomNumberByGuest(id);
        rooms.unbook(roomNumber);
        guests.deleteByID(id);
    }

    /**
     * Calculates the total income for the hotel.
     *
     * @return The total income.
     */
    public int calculateHotelIncome() {
        int income = 0;
        if (guests.count() != 0) {
            for (int i = 1; i <= guests.getNextAutoNumber(); i++) {
                income += guests.getBill(i);
            }
        }

        return income;
    }

    /**
     * Calculates the total outcome for the hotel (salary payments to staff
     * members).
     *
     * @return The total outcome.
     */
    public int calculateHotelOutcome() {
        int outcome = 0;
        if (!staff.isEmpty()) {
            for (int i = 1; i <= staff.getAutoNumber(); i++) {
                outcome += staff.getSalary(i);
            }
        }

        return outcome;
    }

}
