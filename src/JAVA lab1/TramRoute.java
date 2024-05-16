// Перший клас: Трамвайний маршрут
import java.util.Arrays;
import java.util.Comparator;

class TramRoute {
    private int number;
    private double averageInterval;
    private Stop[] stops;

    public TramRoute(int number, double averageInterval, Stop[] stops) {
        this.number = number;
        this.averageInterval = averageInterval;
        this.stops = stops;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAverageInterval() {
        return averageInterval;
    }

    public void setAverageInterval(double averageInterval) {
        this.averageInterval = averageInterval;
    }

    private Stop findStopWithLeastPassengers() {
        if (stops == null || stops.length == 0) {
            throw new IllegalArgumentException("Stops array is null or empty.");
        }

        return Arrays.stream(stops)
                .min(Comparator.comparingInt(Stop::getPassengerCount))
                .orElseThrow(() -> new IllegalStateException("Cannot find stop with least passengers."));
    }

    private Stop findStopWithMostPassengers() {
        if (stops == null || stops.length == 0) {
            throw new IllegalArgumentException("Stops array is null or empty.");
        }

        return Arrays.stream(stops)
                .max(Comparator.comparingInt(Stop::getPassengerCount))
                .orElseThrow(() -> new IllegalStateException("Cannot find stop with most passengers."));
    }

    private Stop findStopWithLongestName() {
        if (stops == null || stops.length == 0) {
            throw new IllegalArgumentException("Stops array is null or empty.");
        }

        return Arrays.stream(stops)
                .max(Comparator.comparingInt(stop -> stop.getName().length()))
                .orElseThrow(() -> new IllegalStateException("Cannot find stop with longest name."));
    }

    public void displayRouteStatistics() {
        if (stops == null || stops.length == 0) {
            throw new IllegalArgumentException("Stops array is null or empty.");
        }

        int totalPassengers = Arrays.stream(stops).mapToInt(Stop::getPassengerCount).sum();
        Stop leastPassengersStop = findStopWithLeastPassengers();
        Stop mostPassengersStop = findStopWithMostPassengers();
        Stop longestNameStop = findStopWithLongestName();

        System.out.println("Total passengers: " + totalPassengers);
        System.out.println("Stop with least passengers: " + leastPassengersStop.getName());
        System.out.println("Stop with most passengers: " + mostPassengersStop.getName());
        System.out.println("Stop with longest name: " + longestNameStop.getName());
    }

    public static void main(String[] args) {
        Stop stop1 = new Stop("Stop 1", 20);
        Stop stop2 = new Stop("Stop 2", 15);
        Stop stop3 = new Stop("Stop 3", 30);
        Stop[] stops = {stop1, stop2, stop3};
        TramRoute tramRoute = new TramRoute(123, 10.5, stops);
        tramRoute.displayRouteStatistics();
    }
}
