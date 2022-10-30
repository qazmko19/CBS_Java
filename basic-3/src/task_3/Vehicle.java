package task_3;

public class Vehicle {
    int cost;
    int speed;
    int year;

    public Vehicle(int cost, int speed, int year) {
        this.cost = cost;
        this.speed = speed;
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
