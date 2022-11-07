package task_5;

import java.util.Scanner;

public class ConverterTemperature {
    public double temperature;

    public ConverterTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void convert() {
        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            String format;

            System.out.print("What temperature format do you want to convert to (kelvin, fahrenheit, 0 for exit): ");
            format = scanner.nextLine();

            switch (format) {
                case "kelvin":
                    System.out.printf("%f degrees Celsius = %f degrees Kelvin\n", temperature, temperature + 273.15);
                    continue;
                case "fahrenheit":
                    System.out.printf("%f degrees Celsius = %f degrees Fahrenheit\n", temperature, (temperature * (9.0 / 5.0)) + 32);
                    continue;
                case "0":
                    break label;
                default:
                    System.out.println("Incorrect format of temperature!\n");
            }
        }
    }
}
