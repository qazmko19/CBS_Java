package task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperature;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write temperature in Celsius: ");
        temperature = scanner.nextDouble();

        ConverterTemperature converterTemperature = new ConverterTemperature(temperature);

        converterTemperature.convert();
    }
}
