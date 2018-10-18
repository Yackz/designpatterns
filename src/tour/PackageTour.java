package tour;

import java.util.Arrays;
import java.util.List;

public class PackageTour implements Tour {
    private List<Tour> tours;
    private String name;

    public PackageTour(String name, Tour... tours) {
        this.tours = Arrays.asList(tours);
        this.name = name;
    }

    public void add(Tour... tours) {
        this.tours.addAll(Arrays.asList(tours));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours) {
            total += t.getPrice();
        }
        return total * 0.9;
    }

    @Override
    public int getAvailableSeats() {
        int hold = 0;
        for (Tour t : tours) {
            if (hold <= t.getAvailableSeats()) {
                hold = t.getAvailableSeats();
            }
        }
        return hold;
    }
}
