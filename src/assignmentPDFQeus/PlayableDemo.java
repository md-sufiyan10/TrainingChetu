package TrainigChetu.src.assignmentPDFQeus;

interface Playable{
    void play();
    // public static final (constants)
    int MAX_VOLUME=100;
}
class Game implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Game . MAX_VOLUME="+MAX_VOLUME);
    }
}
class Music implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Music . MAX_VOLUME="+MAX_VOLUME);
    }
}
public class PlayableDemo {
    static void main(String[] args) {
        Playable[] items={new Game(),new Music()};

        for (Playable p:items) {
            p.play();
        }
        System.out.println("Interface Constant : "+Playable.MAX_VOLUME);

        // But you cannot change it (compile-time error):
        // Playable.MAX_VOLUME = 20;
    }
}
