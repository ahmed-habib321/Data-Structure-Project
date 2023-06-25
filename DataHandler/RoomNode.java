package DataHandler;

import hotel.rooms.Room;

public class RoomNode {

    public Room data;
    public RoomNode prev;
    public RoomNode next;

    public RoomNode(Room data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}
