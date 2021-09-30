package hotel;

import hotel.people.guests.Guest;
import hotel.rooms.RoomType;
import hotel.system.Booking;
import org.junit.Before;
import hotel.rooms.Bedroom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    Bedroom bedroom1;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 5, RoomType.DOUBLE);
        bedroom1 = new Bedroom(3, 6, RoomType.FAMILY);
        booking = new Booking (3, bedroom1);
        guest = new Guest("Jimmy Bob");
    }

    @Test
    public void bookingHasNumNights(){
        assertEquals(3, booking.getNumNights());
    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom1, booking.getBedroom());
    }

    @Test
    public void bookingHasGuests() {
        assertEquals(0, booking.getGuestCount());
    }

    @Test
    public void bookingCanAddGuest() {
        booking.addGuestToBooking(guest);
        assertEquals(1, booking.getGuestCount());
    }


}
