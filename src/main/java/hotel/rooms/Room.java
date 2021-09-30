package hotel.rooms;

import hotel.people.guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    protected ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void addGuestToRoom(Guest guest){
        this.guests.add(guest);

    }



}
