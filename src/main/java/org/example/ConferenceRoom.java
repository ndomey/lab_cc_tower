package org.example;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(RoomType roomType, String name) {
        super(roomType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public int getCapacity(){
//        return super.getRoomType();
//    }
}
