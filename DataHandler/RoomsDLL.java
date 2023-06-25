/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHandler;

import hotel.rooms.Room;

/**
 *
 * @author Ahmed
 */
/**
 * Doubly Linked List implementation for managing rooms and their booking
 * status.
 */
public class RoomsDLL {

    private RoomNode head = null;
    private RoomNode tail = null;

    /**
     * Adds a new room node to the end of the linked list.
     *
     * @param data The room data to be stored in the node.
     */
    public void addNode(Room data) {
        RoomNode node = new RoomNode(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    /**
     * Marks a room as booked based on the given room number.
     *
     * @param roomNumber The room number to book.
     */
    public void book(int roomNumber) {
        RoomNode current = head;

        while (current != null) {
            if (current.data.getRoomNumber() == roomNumber) {
                current.data.setBooked(true);
                break;
            }
            current = current.next;
        }
    }

    /**
     * Marks a room as unbooked based on the given room number.
     *
     * @param roomNumber The room number to unbook.
     */
    public void unbook(int roomNumber) {
        RoomNode current = head;

        while (current != null) {
            if (current.data.getRoomNumber() == roomNumber) {
                current.data.setBooked(false);
                break;
            }
            current = current.next;
        }
    }

    /**
     * Retrieves the night price of a room based on the given room number.
     *
     * @param roomNumber The room number to get the price for.
     * @return The night price of the room, or 0 if the room is not found.
     */
    public int getNightPrice(int roomNumber) {
        RoomNode current = head;

        while (current != null) {
            if (current.data.getRoomNumber() == roomNumber) {
                return current.data.getNightPrice();
            }
            current = current.next;
        }

        return 0;
    }

    /**
     * Checks if a room is booked based on the given room number.
     *
     * @param roomNumber The room number to check.
     * @return false if the room is not free, true otherwise.
     */
    public boolean isBooked(int roomNumber) {
        RoomNode current = head;

        while (current != null) {
            if (current.data.getRoomNumber() == roomNumber) {
                return current.data.isBooked();
            }
            current = current.next;
        }

        return true; // Room not found, assume it is booked
    }

    /**
     * Counts the number of rooms in the linked list.
     *
     * @return The count of rooms.
     */
    public int count() {
        int count = 0;
        RoomNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    /**
     * Displays the details of all rooms in the linked list.
     */
    public void display() {
        RoomNode current = head;

        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    /**
     * Retrieves the room numbers of all unbooked rooms as a string.
     *
     * @return The string containing room numbers of unbooked rooms.
     */
    public String displayUnbooked() {
        RoomNode current = head;
        StringBuilder unbookedRooms = new StringBuilder();

        while (current != null) {
            if (!current.data.isBooked()) {
                unbookedRooms.append(current.data.getRoomNumber()).append(", ");
            }
            current = current.next;
        }

        return unbookedRooms.toString();
    }

}
