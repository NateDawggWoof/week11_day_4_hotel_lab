package hotel.system;

import hotel.people.guests.Guest;
import hotel.rooms.Bedroom;

import java.util.ArrayList;

public class Booking {
    private int numNights;
    private Bedroom bedroom;
    private ArrayList<Guest> guests;

    public Booking(int numNights, Bedroom bedroom) {
        this.numNights = numNights;
        this.bedroom = bedroom;
        this.guests = new ArrayList<>();
    }

    public int getNumNights() {
        return numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public int getGuestCount() {
        return this.guests.size();
    }
}
