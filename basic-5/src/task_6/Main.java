package task_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teacherArrayList = new ArrayList<>();

        teacherArrayList.add(new Teacher("Alla", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Victoria", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Sergiy", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Natalia", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Tetiana", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Victor", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Oleksiy", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Galina", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Svitlana", (int) (Math.random() * 11)));
        teacherArrayList.add(new Teacher("Nikita", (int) (Math.random() * 11)));

        for (Teacher teacher : teacherArrayList) {
            System.out.print(teacher);
        }

        int best = 0;
        int worst = 0;

        for (int i = 0; i < teacherArrayList.size(); i++) {
            if (teacherArrayList.get(i).grade > teacherArrayList.get(best).grade) {
                best = i;
            }
            if (teacherArrayList.get(i).grade < teacherArrayList.get(worst).grade) {
                worst = i;
            }
        }

        System.out.printf("\nThe best teacher has index %d and the worst teacher has index %d", best, worst);
    }
}
