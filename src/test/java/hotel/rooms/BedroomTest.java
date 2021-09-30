package hotel.rooms;

import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(5, 10, RoomType.DOUBLE);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(10, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.DOUBLE,bedroom.getRoomType());
    }
}
