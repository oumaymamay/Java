import java.util.HashMap;
import java.util.Set;

public class TrackList {

    public static void main(String[] args) {
        // Create a HashMap to store track titles and their lyrics
        HashMap<String, String> trackList = new HashMap<>();

        // Add 4 tracks to the trackList
        trackList.put("0", "ena balti");
        trackList.put("1", "Hello adele");
        trackList.put("2","derniere dance indila");
        trackList.put("3", " ya mrayti elyssa ");

        // Pull out one song by its track title
        String track = "2";
        System.out.println("Lyrics for '" + track + "': " + trackList.get(track));

        // Print out all the tracks with their lyrics
        System.out.println("\nAll Tracks and Lyrics:");
        for (String key : trackList.keySet()) {
            System.out.println("Track: " + key + " - Lyrics: " + trackList.get(key));
        }
    }
}
