package org.example;



import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void setUp(){
        ArrayList<Guest> guests = new ArrayList<>();
        bedroom = new Bedroom(RoomType.DOUBLE, 12);
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void getRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

//    @Test
//    public void canGetCapacity() {
//        assertEquals(RoomType.DOUBLE, bedroom.);
//    }

//    @Test
//    public void canAddGuest(){
//        assertEquals(1, );
//    }
}