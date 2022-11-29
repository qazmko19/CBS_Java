package task_4;

public enum Vehicles {
    LAMBORGHINI(100000, "red"), BMW(50000, "green"), MERCEDES(70000, "grey"), HONDA(30000, "yellow"), TOYOTA(65000, "black");

    final int cost;
    final String color;

    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + " has " + getColor() + " color and cost " + cost + "$";
    }
}
