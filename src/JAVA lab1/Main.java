import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stop stop1 = new Stop("Stop 1", 20);
        Stop stop2 = new Stop("Stop 2", 15);
        Stop stop3 = new Stop("Stop 3", 30);
        Stop[] stops = { stop1, stop2, stop3 };

        TramRoute tramRoute = new TramRoute(123, 10.5, stops);
        tramRoute.displayRouteStatistics();

        // Також можна змінювати або отримувати дані про зупинки окремо:
        stops[0].setPassengerCount(25);
        System.out.println("New passenger count for Stop 1: " + stops[0].getPassengerCount());
    }
}