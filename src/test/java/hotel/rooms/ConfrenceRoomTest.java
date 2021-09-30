package hotel.rooms;

import hotel.rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfrenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(10,"Isla");
    }

    @Test
    public void hasName(){
        assertEquals("Isla",conferenceRoom.getName());
    }

}
