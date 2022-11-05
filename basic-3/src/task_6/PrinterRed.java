package task_6;

public class PrinterRed extends Printer {
    @Override
    void print(String value) {
        System.out.println(ANSI_RED + value);
    }
}
