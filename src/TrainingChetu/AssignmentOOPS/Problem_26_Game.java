package TrainigChetu.AssignmentOOPS;

abstract class Game {
    public final void play() {
        start();
        playGame();
        end();
    }
    abstract void start();
    abstract void playGame();
    void end() {
        System.out.println("Game Over");
    }
}
class ChessGame extends Game {
    void start() {
        System.out.println(" Chess Strating..");
    }
    void playGame() {
        System.out.println("Playing Chess : making moves..");
    }
}

public class Problem_26_Game {
    static void main() {
   Game g=new ChessGame();
   g.play();
    }
}
