package co.Uptc.Vinyls.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.model.Song;

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
	public void testUptadeAlbum() {
    	//Arrange
		Song song1 = new Song("We three","3minutes45seconds");
		Song song2 = new Song("Formed","1second");
		
		
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        
        //Act
        ArrayList<Song> result = Song.uptadeSong(songs, "We three", "We'll meet again", null);
        result = Song.uptadeSong(songs, "Formed", null, "2second");
        
        //Assert
        assertTrue(result.get(0).getName().equals("We'll meet again"));
        assertTrue(result.get(1).getName().equals(songs.get(1).getName()) && result.get(1).getDuration().equals("2second"));
    }
}
