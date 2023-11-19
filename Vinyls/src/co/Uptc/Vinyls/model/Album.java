package co.Uptc.Vinyls.model;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Album {
	private String name;
	private String cover;
	private String description;
	private String duration; //Duration
	private String releaseDate; //LocalDate
	private String genre;
	private String recordLabel;
	
    // BUILDER
    public Album(String name, String cover, String description, String duration, String releaseDate, String genre, String recordLabel) {
        this.name = name;
        this.cover = cover;
        this.description = description;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.recordLabel = recordLabel;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public String getRecordLabel() {
        return recordLabel;
    }
    
    public String getDuration() {
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

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
    
    public void setDuration(String duration) {
    	this.duration = duration;
    }


	public ArrayList<Album> deleteAlbum(String name, ArrayList<Album> albums) {
	    boolean existingAlbum = false;
	
	    for (int i = 0; i < albums.size(); i++) {
	        if (albums.get(i).getName() == name) {
	            albums.remove(i);
	            existingAlbum = true;
	            break;
	        }
	    }
	
	    if (existingAlbum) {
	        JOptionPane.showMessageDialog(null, "Album deleted successfully.");
	    } else {
	        JOptionPane.showMessageDialog(null, "The album does not exist. Could not delete.");
	    }
	
	    return albums;
	}
	
	public ArrayList<Album> updateAlbum(ArrayList<Album> albums, String name, String cover, String description, String duration, String releaseDate, String genre, String recordLabel){
		for (int i = 0; i < albums.size(); i++) {
	        if (albums.get(i).getName() == name) {
	            if(name==null) {
	            }else {
	            	albums.get(i).name = name;
	            }if(cover==null) {
	            }else {
	            	albums.get(i).cover = cover;
	            }if(description==null) {
	            }else {
	            	albums.get(i).description = description;
	            }if(duration==null) {
	            }else {
	            	albums.get(i).duration = duration;
	            }if(releaseDate==null) {
	            }else {
	            	albums.get(i).releaseDate= releaseDate;
	            }if(genre==null) {
	            }else {
	            	albums.get(i).genre = genre;
	            }if(recordLabel==null) {
	            }else {
	            	albums.get(i).recordLabel = recordLabel;
	            }
	            break;
	        }
	    }
		return albums;
	}
	
	
}