package org.example;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
