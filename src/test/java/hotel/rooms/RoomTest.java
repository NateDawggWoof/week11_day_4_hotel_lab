package hotel.rooms;

import org.junit.Before;
import org.junit.Test;
import hotel.people.guests.Guest;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Guest guest;

    @Before
    public void before(){
        room = new ConferenceRoom(5,"Isla");
    }

    @Test
    public void roomHasCapacity(){
        assertEquals(5,room.getCapacity());
    }

    @Test
    public void roomHasGuests0(){
        assertEquals(0,room.countGuests());
    }

}
