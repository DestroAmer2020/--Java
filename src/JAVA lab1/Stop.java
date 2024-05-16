// Другий клас: Зупинка
public class Stop {
    private final String name;
    private int passengerCount;

    public Stop(String name, int passengerCount) {
        this.name = name;
        setPassengerCount(passengerCount);
    }

    public String getName() {
        return name;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount >= 0) {
            this.passengerCount = passengerCount;
        } else {
            throw new IllegalArgumentException("Passenger count cannot be negative.");
        }
    }

    @Override
    public String toString() {
        return "Stop{" +
                "name='" + name + '\'' +
                ", passengerCount=" + passengerCount +
                '}';
    }
}
