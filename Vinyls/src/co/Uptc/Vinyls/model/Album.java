package co.Uptc.Vinyls.model;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;



public class Album {
	private String name;
	private String cover;
	private String description;
	private Duration duration; //Duration
	private LocalDate releaseDate; //LocalDate
	private String genre;
	private String recordLabel;
	
    // BUILDERS
    public Album(String name, String cover, String description, Duration duration, LocalDate releaseDate, String genre, String recordLabel) {
        this.name = name;
        this.cover = cover;
        this.description = description;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.recordLabel = recordLabel;
    }
    public Album() {
        
    }
    
    // METHODS GETTER
    public String getName() {
        return name;
    }

    public String getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public String getRecordLabel() {
        return recordLabel;
    }
    
    public Duration getDuration() {
    	return duration;
    }
    
    // METHODS SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
    
    public void setDuration(Duration duration) {
    	this.duration = duration;
    }

	public static ArrayList<Album> deleteAlbum(String name, ArrayList<Album> albums) {
	    boolean existingAlbum = false;
	
	    for (int i = 0; i < albums.size(); i++) {
	        if (albums.get(i).getName().equals(name)) {
	            albums.remove(i);
	            existingAlbum = true;
	            break;
	        }
	    }
	
	    if (existingAlbum) {
	        System.out.print("Album deleted successfully.");
	    } else {
	    	System.out.print("The album does not exist. Could not delete.");
	    }
	
	    return albums;
	}
	
	public static void listAlbums(ArrayList<Album> albums) {
        if (albums.isEmpty()) {
            System.out.println("No albums available.");
        } else {
            albums.sort(Comparator.comparing(Album::getName)); 

            System.out.print("List of Albums (Alphabetical Order by Name):"+"\n");
            for (Album album : albums) {
                System.out.print("Name: " + album.getName() + ", Release Date: " + album.getReleaseDate()+"\n");
               
            }
        }
    }
	
	
}