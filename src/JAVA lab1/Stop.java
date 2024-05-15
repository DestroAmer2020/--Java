// Другий клас: Зупинка
public class Stop {
    private String name;
    private int passengerCount;
    public Stop(String name, int passengerCount) {
        this.name = name;
        this.passengerCount = passengerCount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassengerCount() {
        return passengerCount;
    }
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
}