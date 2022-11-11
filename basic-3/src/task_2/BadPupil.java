package task_2;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("bad");
    }

    @Override
    void read() {
        System.out.println("bad");
    }

    @Override
    void write() {
        System.out.println("bad");
    }

    @Override
    void relax() {
        System.out.println("bad");
    }
}
