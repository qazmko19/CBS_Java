package task_6;

public class PrinterBlue extends Printer {
    @Override
    void print(String value) {
        System.out.println(ANSI_BLUE + value);
    }
}
