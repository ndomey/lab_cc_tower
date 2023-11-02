package org.example;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int RoomNumber;

    public Bedroom(RoomType roomType, int roomNumber) {
        super(roomType);
        RoomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }


}

