package co.Uptc.Vinyls.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import co.Uptc.Vinyls.controller.SongController;
import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.model.Song;
import co.Uptc.Vinyls.view.SongView;

class SongTest {

	@Test
	public void testSongConstructor() {
        // Arrange
        String name = "SongName";
        String duration = "SongDuration";
        
        // Act
        Song song = new Song(name,duration);

        // Assert
        assertEquals(name, song.getName());
        assertEquals(duration, song.getDuration());
    }
	
	@Test
	public void testUptadeSong() {
		ArrayList<Song> songs = new ArrayList<>();
		SongView songView = new SongView();
        SongController songController = new SongController(songs, songView);
    	//Arrange
		Song song1 = new Song("We three","3minutes45seconds");
		Song song2 = new Song("Formed","1second");

        songs.add(song1);
        songs.add(song2);
        
        //Act
        
        songController.updateSong("We three");
        songController.updateSong("Formed");
        
        //Assert
        assertTrue(songs.get(0).getName().equals("We'll meet again"));
        assertTrue(songs.get(1).getName().equals(songs.get(1).getName()) && songs.get(1).getDuration().equals("2second"));
    }
	
	/*@Test
    void testListSongsOutput() {
        Song song1 = new Song("Song A", "Duration1");
        Song song2 = new Song("Song C", "Duration2");
        Song song3 = new Song("Song B", "Duration3");

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Song.listSongs(songs);

        System.setOut(System.out);

        String expectedOutput = "List of Songs (Alphabetical Order by Name):\n" +
                "Name: Song A, Duration: Duration1\n" +
                "Name: Song B, Duration: Duration3\n" +
                "Name: Song C, Duration: Duration2\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
	
	@Test
    void testDeleteSong() {
		Song song1 = new Song("Song A", "Duration1");
        Song song2 = new Song("Song C", "Duration2");
        Song song3 = new Song("Song B", "Duration3");

        
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);

        
        ArrayList<Song> updatedSongs = Song.deleteSong("Song B", songs);

        assertFalse(updatedSongs.contains(song3), "Song B should be deleted.");

        assertTrue(updatedSongs.contains(song1), "Song A should still be present.");
        assertTrue(updatedSongs.contains(song2), "Song C should still be present.");

    }*/
}
