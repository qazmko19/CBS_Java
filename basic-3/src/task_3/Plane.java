package task_3;

public class Plane extends Vehicle {
    int maxHeight;
    int maxPassenger;

    public Plane(int cost, int speed, int year, int maxHeight, int maxPassenger) {
        super(cost, speed, year);
        this.maxHeight = maxHeight;
        this.maxPassenger = maxPassenger;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
}
