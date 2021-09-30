package hotel;

import hotel.people.guests.Guest;
import hotel.rooms.Bedroom;
import hotel.rooms.DiningRoom;
import hotel.rooms.Room;
import hotel.system.Booking;

import java.util.ArrayList;
import java.util.HashMap;


public class Hotel {

    private HashMap<String, DiningRoom> diningRooms;

    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
        this.diningRooms = new HashMap<>();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public int countDiningRooms() {
        return this.diningRooms.size();
    }

    public ArrayList<Room> getEmptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();
        for (Room room : this.rooms) {
            if (room.countGuests() == 0) {
                emptyRooms.add(room);
            }
        }
        return emptyRooms;
    }

    public int getEmptyRoomCount() {
        return this.getEmptyRooms().size();

    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int countRooms() {
        return this.rooms.size();
    }

    public void checkInGuestToRoom(Guest guest, Bedroom bedroom1) {
        bedroom1.addGuestToRoom(guest);
    }

    public Booking bookRoom(int numNights, Bedroom bedroom1, Guest guest) {
        Booking booking;
        booking = new Booking(numNights, bedroom1);
        booking.addGuestToBooking(guest);
        return booking;
    }

    public void addRoomToHotel(Room room) {
        this.rooms.add(room);
    }
}