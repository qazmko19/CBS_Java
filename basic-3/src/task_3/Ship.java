package task_3;

public class Ship extends Vehicle {
    int maxPassenger;
    String port;

    public Ship(int cost, int speed, int year, int maxPassenger, String port) {
        super(cost, speed, year);
        this.maxPassenger = maxPassenger;
        this.port = port;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
