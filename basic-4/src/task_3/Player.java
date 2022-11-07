package task_3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("playing");
    }

    @Override
    public void record() {
        System.out.println("recording");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
