package TrainigChetu.AssignmentOOPS;

interface Playable   {
    void play();
}
class  Cricket implements Playable{
    public void play(){
        System.out.println("Cricket is playing Bowling and Batting...");
    }
}
class VideoGames implements Playable{
    public void play(){
        System.out.println("Video Games are playing FPS and RPG...");
    }
}
public class Problem_19_Interface_Games {
    static void main() {
      Playable[] games={new Cricket(),new VideoGames()};
      for(Playable game:games) {
          game.play();
      }
    }
}
