package hotel.rooms;

public enum RoomType {

    SINGLE(1, 20),
    DOUBLE(2, 30),
    TRIPLE(3, 40),
    FAMILY(4, 50);

    private final int capacity;
    private final int price;

    RoomType(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() { return price; }
}
