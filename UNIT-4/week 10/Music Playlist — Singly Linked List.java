import java.util.*;

class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList<>();

        songs.add("Song A");
        songs.add("Song B");
        songs.add("Song C");

        System.out.println("Playlist: " + songs);

        songs.remove("Song B");

        System.out.println("After removing Song B: " + songs);

        songs.add("Song D");

        System.out.println("Updated playlist: " + songs);
    }
}
