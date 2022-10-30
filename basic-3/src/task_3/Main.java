package task_3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(3000000, 500, 2010, 10, 350);
        Car car = new Car(5000, 150, 2001);
        Ship ship = new Ship(10000000, 25, 2015, 1200, "Odessa");

        System.out.printf("This plane cost %d $, speed is %d km/h, year is %d, max height is %d km and max passengers is %d.\n", plane.getCost(), plane.getSpeed(), plane.getYear(), plane.getMaxHeight(), plane.getMaxPassenger());
        System.out.printf("This car cost %d $, speed is %d km/h and year is %d.\n", car.getCost(), car.getSpeed(), car.getYear());
        System.out.printf("This ship cost %d &, speed is %d knots, year is %d, max passenger is %d and port is %s.\n", ship.getCost(), ship.getSpeed(), ship.getYear(), ship.getMaxPassenger(), ship.getPort());
    }
}
