package task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = scanner.nextLine();

        if (key.equals("pro")) {
            DocumentWorker documentWorkerPro = new ProDocumentWorker();
            System.out.printf("You created new document in Pro version. %s. %s. %s.", documentWorkerPro.openDocument(), documentWorkerPro.editDocument(), documentWorkerPro.saveDocument());
        } else if (key.equals("expert")) {
            DocumentWorker documentWorkerExpert = new ExpertDocumentWorker();
            System.out.printf("You created new document in Expert version. %s. %s. %s.", documentWorkerExpert.openDocument(), documentWorkerExpert.editDocument(), documentWorkerExpert.saveDocument());
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.printf("You created new document in classic version. %s. %s. %s.", documentWorker.openDocument(), documentWorker.editDocument(), documentWorker.saveDocument());
        }
    }
}
