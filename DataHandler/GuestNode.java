package DataHandler;

import hotel.Person.Guest;

/**
 * The GuestNode class represents a node in a Single linked list of guests. Each node
 * contains guest data and a reference to the next node in the list.
 */
public class GuestNode {

    public Guest data;
    public GuestNode next;

    /**
     * Constructs a new GuestNode object with the specified guest data.
     *
     * @param data the guest data to be stored in the node
     */
    public GuestNode(Guest data) {
        this.data = data;
        this.next = null;
    }

}
