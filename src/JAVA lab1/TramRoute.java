// Перший клас: Трамвайний маршрут
class TramRoute {
    private int number;
    private double averageInterval;
    public TramRoute(int number, double averageInterval) {
        this.number = number;
        this.averageInterval = averageInterval;
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
    public Stop findStopWithLeastPassengers(Stop[] stops) {
        Stop leastPassengersStop = stops[0];
        for (int i = 1; i < stops.length; i++) {
            if (stops[i].getPassengerCount() < leastPassengersStop.getPassengerCount()) {
                leastPassengersStop = stops[i];
            }
        }
        return leastPassengersStop;
    }
    public Stop findStopWithMostPassengers(Stop[] stops) {
        Stop mostPassengersStop = stops[0];
        for (int i = 1; i < stops.length; i++) {
            if (stops[i].getPassengerCount() > mostPassengersStop.getPassengerCount()) {
                mostPassengersStop = stops[i];
            }
        }
        return mostPassengersStop;
    }
    public Stop findStopWithLongestName(Stop[] stops) {
        Stop longestNameStop = stops[0];
        for (int i = 1; i < stops.length; i++) {
            if (stops[i].getName().length() > longestNameStop.getName().length()) {
                longestNameStop = stops[i];
            }
        }
        return longestNameStop;
    }
    public void performMainTask(Stop[] stops) {
        int totalPassengers = 0;
        for (Stop stop : stops) {
            totalPassengers += stop.getPassengerCount();
        }
        Stop leastPassengersStop = findStopWithLeastPassengers(stops);
        Stop mostPassengersStop = findStopWithMostPassengers(stops);
        Stop longestNameStop = findStopWithLongestName(stops);
        System.out.println("Загальна кількість пасажирів: " + totalPassengers);
        System.out.println("Зупинка з найменшою кількістю пасажирів: " + leastPassengersStop.getName());
        System.out.println("Зупинка з найбільшою кількістю пасажирів: " + mostPassengersStop.getName());
        System.out.println("Зупинка з найдовшою назвою: " + longestNameStop.getName());
    }

    public static void main(String[] args) {
        Stop stop1 = new Stop("Зупинка 1", 20);
        Stop stop2 = new Stop("Зупинка 2", 15);
        Stop stop3 = new Stop("Зупинка 3", 30);
        Stop[] stops = { stop1, stop2, stop3 };
        TramRoute tramRoute = new TramRoute(123, 10.5);
        tramRoute.performMainTask(stops);
    }
}