package hotel.rooms;

import org.junit.Before;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom(10, "The Amazon Room");
    }
}
