package assignmentCollection.LinkedList;

import java.util.LinkedList;

public class PlaylistManager {
    static void main() {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song1");
        playlist.add("Song2");
        playlist.add("Song3");

        // a) Play first song (removeFirst)
         playlist.removeFirst();
         System.out.println("Playing: " + playlist.getFirst());

        // b) Add "Song0" at beginning
        playlist.addFirst("Song0");
        System.out.println("Playlist Add Song0 at Beginning: " + playlist);

        // c) Add "Song4" at end
        playlist.addLast("Song4");
        System.out.println("Playlist Add Song4 at End: " + playlist);


        // d) Move currently playing to end
        playlist.removeFirst();
        playlist.addLast(playlist.getFirst());
        System.out.println("Playlist Move Currently Playing to End: " + playlist);


        // e) Print playlist
        System.out.println("Playlist: " + playlist);
        System.out.println("-----------------------");
        for(String song : playlist){
            System.out.println(song);
        }
    }
}
