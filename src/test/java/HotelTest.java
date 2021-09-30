import hotel.Hotel;
import hotel.people.guests.Guest;

import hotel.rooms.Bedroom;
import hotel.rooms.DiningRoom;
import hotel.rooms.Room;
import hotel.rooms.RoomType;
import hotel.system.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest;
    Booking booking;
    DiningRoom diningRoom;


    @Before
    public void before(){
        hotel = new Hotel();
        booking = new Booking(4, bedroom1);
        bedroom1 = new Bedroom(2,5, RoomType.DOUBLE);
        bedroom2 = new Bedroom(3,5, RoomType.TRIPLE);
        bedroom3 = new Bedroom(4,5, RoomType.FAMILY);
        guest = new Guest("Jimmy Bob");
        diningRoom = new DiningRoom(10, "The Amazon Room");

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
        assertEquals(4, booking.getNumNights());
    }

    @Test
    public void bookRoomHasBedroom(){
        Booking booking = hotel.bookRoom(4, bedroom1, guest);
        assertEquals(5, booking.getBedroom().getRoomNumber());
    }

    @Test
    public void bookRoomHasGuest() {
        booking.addGuestToBooking(guest);
        assertEquals(1, booking.getGuestCount());
    }

    @Test
    public void diningRoomHashMap() {
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void getEmptyRoomCount() {
        hotel.addRoomToHotel(bedroom1);
        hotel.addRoomToHotel(bedroom2);
        bedroom2.addGuestToRoom(guest);
        hotel.addRoomToHotel(bedroom3);
        assertEquals(2, hotel.getEmptyRoomCount());

    }

}
