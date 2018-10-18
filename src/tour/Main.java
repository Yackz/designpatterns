package tour;

public class Main {
    public static void main(String[] args) {
        SingleTour single = new SingleTour("King",1000,50,25);
        System.out.println(single.getName() + " " + single.getAvailableSeats() + " " + single.getPrice());
        Tour tour = new PackageTour("Test Tour",
                new SingleTour("A", 1000, 60,42),
                new SingleTour("B", 2000, 50,38));
        System.out.println(tour.getName() + " " + tour.getAvailableSeats() + " " + tour.getPrice());
    }
}