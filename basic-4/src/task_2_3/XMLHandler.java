package task_2_3;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("XML file is open");
    }

    @Override
    void create() {
        System.out.println("XML file was created");
    }

    @Override
    void change() {
        System.out.println("XML file was changed");
    }

    @Override
    void save() {
        System.out.println("XML file was saved");
    }
}
