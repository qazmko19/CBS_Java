package task_6;

public class PrinterGreen extends Printer {
    @Override
    void print(String value) {
        System.out.println(ANSI_GREEN + value);
    }
}
