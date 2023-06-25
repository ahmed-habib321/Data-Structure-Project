package DataHandler;

import hotel.Person.Guest;

/**
 *
 * @author Ahmed
 */

/**
 * The GuestsSLL class represents a singly linked list of guests.
 */
public class GuestsSLL {

    private GuestNode head = null;

    /**
     * Adds a guest to the linked list.
     *
     * @param guest The guest to be added.
     */
    public void addGuest(Guest guest) {
        GuestNode node = new GuestNode(guest);
        if (head == null) {
            head = node;
        } else {
            GuestNode Pointer = head;
            while (Pointer.next != null) {
                Pointer = Pointer.next;
            }
            Pointer.next = node;
        }
    }

    /**
     * Deletes a guest from the linked list based on their ID.
     *
     * @param ID The ID of the guest to be deleted.
     */
    public void deleteByID(int ID) {
        if (head != null) {
            if (head.data.getId() == ID) {
                head = head.next;
            } else {
                GuestNode previousNode = head;
                GuestNode Pointer = head.next;
                while (Pointer != null) {
                    if (Pointer.data.getId() == ID) {
                        break;
                    }
                    previousNode = previousNode.next;
                    Pointer = Pointer.next;
                }
                if (Pointer != null) {
                    previousNode.next = Pointer.next;
                }
            }
        }
    }

    /**
     * Counts the number of guests in the linked list.
     *
     * @return The count of guests.
     */
    public int count() {
        int count = 0;
        GuestNode Pointer = head;
        while (Pointer != null) {
            count++;
            Pointer = Pointer.next;
        }
        return count;
    }

    /**
     * Displays the details of all guests in the linked list.
     */
    public void display() {
        GuestNode Pointer = head;
        while (Pointer != null) {
            System.out.println(Pointer.data.toString());
            Pointer = Pointer.next;
        }
    }

    /**
     * Returns the next available auto-generated guest ID.
     *
     * @return The next available guest ID.
     */
    public int getNextAutoNumber() {
        GuestNode Pointer = head;
        while (Pointer.next != null) {
            Pointer = Pointer.next;
        }
        return Pointer.data.getId() + 1;
    }

    /**
     * Retrieves a guest based on their ID.
     *
     * @param id The ID of the guest to retrieve.
     * @return The guest object if found, null otherwise.
     */
    public Guest getByID(int id) {
        GuestNode Pointer = head;
        while (Pointer != null) {
            if (Pointer.data.getId() == id) {
                return Pointer.data;
            }
            Pointer = Pointer.next;
        }
        return null;
    }

    /**
     * Retrieves the bill amount for a guest.
     *
     * @param guestNumber The guest number.
     * @return The bill amount if guest exists, 0 otherwise.
     */
    public double getBill(int guestNumber) {
        Guest guest = getByID(guestNumber);
        if (guest != null) {
            return guest.getBill();
        }
        return 0;
    }

    /**
     * Retrieves the room number for a guest.
     *
     * @param guestNumber The guest number.
     * @return The room number if guest exists, 0 otherwise.
     */
    public int getRoomNumberByGuest(int guestNumber) {
        GuestNode Pointer = head;
        while (Pointer != null) {
            if (Pointer.data.getId() == guestNumber) {
                return Pointer.data.getRoomNumber();
            }
            Pointer = Pointer.next;
        }
        return 0;
    }

}
