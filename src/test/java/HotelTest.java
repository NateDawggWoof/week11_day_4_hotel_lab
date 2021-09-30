import hotel.Hotel;
import hotel.people.guests.Guest;

import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(2,5, RoomType.DOUBLE);
        guest = new Guest("Jimmy Bob");
    }

    @Test
    public void hasRooms0(){
        assertEquals(0,hotel.countRooms());
    }

    @Test
    public void addGuestToRoom(){
        hotel.checkInGuestToRoom(guest, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }

}
