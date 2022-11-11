package task_4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i);
        }

        System.out.println(integerArrayList);

        ListIterator<Integer> integerListIterator = integerArrayList.listIterator();

        while (integerListIterator.hasNext()) {
            integerListIterator.set(integerListIterator.next() + 1);
        }

        System.out.println(integerArrayList);
    }
}
