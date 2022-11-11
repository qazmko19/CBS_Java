package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractHandler abstractHandler;

        label:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What file you want to create (xml, doc, txt)? ");
            String inputFile = scanner.nextLine();

            switch (inputFile) {
                case "xml":
                    abstractHandler = new XMLHandler();
                    abstractHandler.create();
                    break label;
                case "doc":
                    abstractHandler = new DOCHandler();
                    abstractHandler.create();
                    break label;
                case "txt":
                    abstractHandler = new TXTHandler();
                    abstractHandler.create();
                    break label;
                default:
                    System.out.println("Incorrect file type. Try again.");
            }
        }

        label1:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What do you want to do with this file (open, change, save (close file))? ");
            String inputTask = scanner.nextLine();

            switch (inputTask) {
                case "open":
                    abstractHandler.open();
                    continue;
                case "change":
                    abstractHandler.change();
                    continue;
                case "save":
                    abstractHandler.save();
                    break label1;
                default:
                    System.out.println("Incorrect task for this file. Try again.");
            }
        }
    }
}
