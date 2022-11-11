package task_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write count of pupils: ");
        int count = scanner.nextInt();

        Pupil[] pupils = new Pupil[0];
        if (count > 4 || count < 1) {
            System.out.printf("You can`t add %d pupils for this classroom", count);
        } else {
            pupils = new Pupil[count];

            label:
            for (int i = 0; i < count; i++) {
                System.out.printf("Write parameter for %d pupil (excelent, bad, good): ", i + 1);
                String data = scanner.next();

                switch (data) {
                    case "excelent":
                        pupils[i] = new ExcelentPupil();
                        break;
                    case "bad":
                        pupils[i] = new BadPupil();
                        break;
                    case "good":
                        pupils[i] = new GoodPupil();
                        break;
                    default:
                        System.out.println("Incorrect parameter!");
                        break label;
                }
            }
        }

        ClassRoom classRoom = new ClassRoom(pupils);

        for (int i = 0; i < classRoom.pupils.length; i++) {
            if (i == 0) {
                System.out.println("=============================");
            }
            System.out.printf("Student %d study: ", i + 1);
            classRoom.pupils[i].study();
            System.out.printf("Student %d read: ", i + 1);
            classRoom.pupils[i].read();
            System.out.printf("Student %d write: ", i + 1);
            classRoom.pupils[i].write();
            System.out.printf("Student %d relax: ", i + 1);
            classRoom.pupils[i].relax();
            System.out.println("=============================");
        }
    }
}
