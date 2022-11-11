package task_2_3;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT file is open");
    }

    @Override
    void create() {
        System.out.println("TXT file was created");
    }

    @Override
    void change() {
        System.out.println("TXT file was changed");
    }

    @Override
    void save() {
        System.out.println("TXT file was saved");
    }
}
