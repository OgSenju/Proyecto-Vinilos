package co.Uptc.Vinyls.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.Test;

import co.Uptc.Vinyls.Runner.Main;
import co.Uptc.Vinyls.model.Album;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlbumTest {

    @Test
    public void testAlbumConstructor() {
        // Arrange
        String name = "AlbumName";
        String cover = "CoverPath";
        String description = "AlbumDescription";
        String duration = "AlbumDuration";
        String releaseDate = "ReleaseDate";
        String genre = "AlbumGenre";
        String recordLabel = "RecordLabel";

        // Act
        Album album = new Album(name, cover, description, duration, releaseDate, genre, recordLabel);

        // Assert
        assertEquals(name, album.getName());
        assertEquals(cover, album.getCover());
        assertEquals(description, album.getDescription());
        assertEquals(duration, album.getDuration());
        assertEquals(releaseDate, album.getReleaseDate());
        assertEquals(genre, album.getGenre());
        assertEquals(recordLabel, album.getRecordLabel());
    }
    
    @Test
    public void testDeleteAlbum() {
    	//Arrange
    	Album album1 = new Album("Album1", "Cover1", "Description1", "Duration1", "ReleaseDate1", "Genre1", "RecordLabel1");
        Album album2 = new Album("Album2", "Cover2", "Description2", "Duration2", "ReleaseDate2", "Genre2", "RecordLabel2");
        Album album3 = new Album("Album3","Cover3","Description2","Duration2","ReleaseDate2","Genre2","RecordLabel2");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        //Act
        ArrayList<Album> result = Album.deleteAlbum("Album2", albums);

        // Assert
        assertEquals(2, result.size());

        assertFalse(result.contains(album2));

        assertTrue(result.contains(album1));
        assertTrue(result.contains(album3));
    }
    
    @Test
    public void testUptadeAlbum() {
    	//Arrange
    	Album album1 = new Album("Album1", "Cover1", "Description1", "Duration1", "ReleaseDate1", "Genre1", "RecordLabel1");
        Album album2 = new Album("Album2", "Cover2", "Description2", "Duration2", "ReleaseDate2", "Genre2", "RecordLabel2");
        Album album3 = new Album("Album3","Cover3","Description2","Duration2","ReleaseDate2","Genre2","RecordLabel2");
        
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        
        //Act
        ArrayList<Album> result = Album.updateAlbum(albums, "Album1", "LaCohamamba", null, null, null, null, "Cumbion", null);
        result = Album.updateAlbum(albums, "Album3", null, null, null, null, null, null, null);
        
        //Assert
        assertEquals(3, result.size());
        assertTrue((result.get(0).getName().equals("LaCohamamba") && result.get(0).getGenre().equals("Cumbion")) && result.get(0).getRecordLabel().equals(result.get(0).getRecordLabel()));
        assertTrue(result.get(2).getName().equals("Album3"));
    }
    
    @Test
    public void testListAlbums() {
        // Arrange
        Album album1 = new Album("Album1", "Cover1", "Description1", "Duration1", "ReleaseDate1", "Genre1", "RecordLabel1");
        Album album2 = new Album("Album2", "Cover2", "Description2", "Duration2", "ReleaseDate2", "Genre2", "RecordLabel2");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        Album.listAlbums(albums);

        // Restore System.out
        System.setOut(System.out);

        // Assert
        String expectedOutput = "List of Albums (Alphabetical Order by Name):\n"+
        						"Name: Album1, Release Date: ReleaseDate1\n" +
                                "Name: Album2, Release Date: ReleaseDate2\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}



