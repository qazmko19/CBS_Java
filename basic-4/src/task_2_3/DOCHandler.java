package task_2_3;

public class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("DOC file is open");
    }

    @Override
    void create() {
        System.out.println("DOC file was created");
    }

    @Override
    void change() {
        System.out.println("DOC file was changed");
    }

    @Override
    void save() {
        System.out.println("DOC file was saved");
    }
}
