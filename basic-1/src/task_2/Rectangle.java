package task_2;

import java.util.Scanner;

public class Rectangle {
    static double side1;
    static double side2;

    public static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public static double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        side1 = scanner.nextDouble();
        side2 = scanner.nextDouble();

        System.out.println("Area is: " + areaCalculator(side1, side2));
        System.out.println("Perimeter is: " + perimeterCalculator(side1, side2));
    }
}
