package hotel;

import hotel.people.guests.Guest;
import hotel.rooms.Bedroom;
import hotel.rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
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
}
