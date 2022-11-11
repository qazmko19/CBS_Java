package task_2_3;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
//      task 2
        zoo.setZooList();
        zoo.getZooList();
//      task 3
        zoo.removeZooList();
        System.out.println(zoo.zooList.size());
        zoo.getZooList();
    }
}
