package task_2_3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> zooList;

    public Zoo() {
        this.zooList = new ArrayList<>();
    }

    public void getZooList() {
        System.out.println(zooList.toString());
    }

    public void setZooList() {
        zooList.add(0, "cat");
        zooList.add(1, "dog");
        zooList.add(2, "monkey");
        zooList.add(3, "giraffe");
        zooList.add(4, "elephant");
        zooList.add(5, "tiger");
        zooList.add(6, "rabbit");
        zooList.add(7, "parrot");
    }

    public void removeZooList() {
        zooList.remove("monkey");
        zooList.remove("elephant");
        zooList.remove("rabbit");
    }
}
