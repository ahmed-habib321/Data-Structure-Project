package DataHandler;

import hotel.Person.Staff;

/**
 *
 * @author Ahmed
 */
/**
 * Represents a node in a staff Double linked list.
 */
public class StaffNode {

    Staff data;
    StaffNode previous;

    /**
     * Constructs a new StaffNode object with the given data.
     *
     * @param data the staff data associated with this node
     */
    public StaffNode(Staff data) {
        this.data = data;
        this.previous = null;
    }

}
