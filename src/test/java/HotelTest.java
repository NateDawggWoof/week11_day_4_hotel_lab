import hotel.Hotel;
import hotel.people.guests.Guest;

import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import hotel.system.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Guest guest;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel();
        booking = new Booking(4, bedroom1);
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

    @Test
    public void bookRoomHasNumNights(){
        Booking booking = hotel.bookRoom(4, bedroom1);
        assertEquals(4, booking.getNumNights());
    }

    @Test
    public void bookRoomHasBedroom(){
        Booking booking = hotel.bookRoom(4, bedroom1);
        assertEquals(5, booking.getBedroom().getRoomNumber());
    }

}
