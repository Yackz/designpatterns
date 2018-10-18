package tour;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reserved;

    public SingleTour(String name, double price, int allSeats,int reserved) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        this.reserved = reserved;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeats() {
        return allSeats - reserved;
    }
}
