package co.Uptc.Vinyls.Test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import co.Uptc.Vinyls.model.Album;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlbumTest {

    @Test
    public void testAlbumConstructor() {
        // Arrange (preparar datos de prueba)
        String name = "AlbumName";
        String cover = "CoverPath";
        String description = "AlbumDescription";
        String duration = "AlbumDuration";
        String releaseDate = "ReleaseDate";
        String genre = "AlbumGenre";
        String recordLabel = "RecordLabel";

        // Act (actuar, llamar al constructor)
        Album album = new Album(name, cover, description, duration, releaseDate, genre, recordLabel);

        // Assert (verificar los resultados)
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
        Album album1 = new Album("Album1","Not","ULala","45second","Six of september","Salsa","Elpepe");
        Album album2 = new Album("Album2","Yes","ULala","45second","Six of september","Pop","Wuacah");
        Album album3 = new Album("Album3","Yes","Lili","67seconds","four of september","Rock","Wuala");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        
        Album album = new Album();
        ArrayList<Album> result = album.deleteAlbum("Album2", albums);

        // Assert
        assertEquals(2, result.size()); // Se espera que haya dos álbumes después de eliminar uno.

        assertFalse(result.contains(album2)); // Se espera que el álbum2 haya sido eliminado.

        assertTrue(result.contains(album1)); // Se espera que el álbum1 esté presente.
        assertTrue(result.contains(album3)); // Se espera que el álbum3 esté presente.
    }
}

