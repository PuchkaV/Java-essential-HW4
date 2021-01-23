package task3;

public class Player implements Playable, Recodable {

    public Player() {
        super();
    }

    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pausePlay() {
        System.out.println("Play pause");
    }

    @Override
    public void stopPlay() {
        System.out.println("Play stop");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void pauseRecord() {
        System.out.println("Record pause");
    }

    @Override
    public void stopRecord() {
        System.out.println("Record stop");
    }
}
