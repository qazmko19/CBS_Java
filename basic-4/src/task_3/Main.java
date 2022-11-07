package task_3;

public class Main {
    public static void main(String[] args) {
        Playable playable = new Player();

        System.out.print("Music is ");
        playable.play();
        System.out.print("Music is ");
        playable.pause();
        System.out.print("Music is ");
        playable.stop();

        Recodable recodable = new Player();

        System.out.print("Music is ");
        recodable.record();
        System.out.print("Music recording is ");
        recodable.pause();
        System.out.print("Music recording is ");
        recodable.stop();
    }
}
