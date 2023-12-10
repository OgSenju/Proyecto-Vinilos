package co.Uptc.Vinyls.controller;

import java.util.ArrayList;
import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.view.AlbumView;

public class AlbumController {
	private ArrayList<Album> albums;
    private AlbumView albumView;
    
	public AlbumController(ArrayList<Album> albums, AlbumView albumView) {
		this.albums = albums;
		this.albumView = albumView;
	}
    
	public void createAndAddSong() {
        Album newSong = albumView.createAlbum();
        albums.add(newSong);
    }
	
	public void updateSong(String name) {
        for (Album album : albums) {
            if (album.getName().equals(name)) {
                String newName = albumView.enterNewName();
                String newDuration = albumView.enterNewDuration();
                String newCover = albumView.enterNewCover();
                String newDescription = albumView.enterNewDescription();
                String newReleaseDate = albumView.enterNewReleaseDate();
                String newGenre = albumView.enterNewGenre();
                String newRecordLabel = albumView.enterNewRecordLabel();
                
                if (!newName.isEmpty()) {
                    album.setName(newName);
                }
                if (!newDuration.isEmpty()) {
                    album.setDuration(newDuration);
                }
                if (!newCover.isEmpty()) {
                    album.setCover(newCover);
                }
                if (!newDescription.isEmpty()) {
                    album.setDescription(newDescription);
                }
                if (!newReleaseDate.isEmpty()) {
                    album.setReleaseDate(newReleaseDate);
                }
                if (!newGenre.isEmpty()) {
                    album.setGenre(newGenre);
                }
                if (!newRecordLabel.isEmpty()) {
                    album.setRecordLabel(newRecordLabel);
                }
                System.out.println("Album updated successfully!");
                return;
            }
        }

        System.out.println("Song not found.");
    }
	
	public void deleteAlbum() {
		String albumToDelete = albumView.enterAlbumToDelete();
		
		for (int i = 0; i<albums.size(); i++) {
			if(albums.get(i).getName().equals(albumToDelete)) {
				albums.remove(i);
				System.out.println("Album deleted successfully.");
                return;
			}
			
		}
		System.out.println("The album does not exist. Could not delete.");
	}
}
