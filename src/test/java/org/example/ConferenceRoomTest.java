package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        ArrayList<Guest> guests = new ArrayList<>();
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE,"The Tartan Room" );
    }

    @Test
    public void hasName(){
        assertEquals("The Tartan Room", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getRoomType().getCapacity());
    }

}
