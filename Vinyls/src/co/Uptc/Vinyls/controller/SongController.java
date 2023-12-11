package co.Uptc.Vinyls.controller;

import java.time.Duration;
import java.util.ArrayList;
import co.Uptc.Vinyls.model.Song;
import co.Uptc.Vinyls.view.SongView;


public class SongController {
	private ArrayList<Song> songs;
    private SongView songView;

    public SongController(ArrayList<Song> songs, SongView songView) {
        this.songs = songs;
        this.songView = songView;
    }

    public void createAndAddSong() {
        Song newSong = songView.createSong();
        songs.add(newSong);
    }
    
    public void updateSong(String name) {
        for (Song song : songs) {
            if (song.getName().equals(name)) {
                String newName = songView.enterNewName();
                Duration newDuration = songView.enterNewDuration();

                if (!newName.isEmpty()) {
                    song.setName(newName);
                }
                if (newDuration!= null) {
                	song.setDuration(newDuration);
                }
                System.out.println("Song updated successfully!");
                return;
            }
        }

        System.out.println("Song not found.");
    }
    
    public void deleteSong() {
        String nameToDelete = songView.enterSongToDelete();

        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(nameToDelete)) {
                songs.remove(i);
                System.out.println("Song deleted successfully.");
                return;
            }
        }

        System.out.println("The song does not exist. Could not delete.");
    }
}
