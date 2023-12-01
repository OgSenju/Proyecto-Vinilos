package co.Uptc.Vinyls.model;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;



public class Album {
	private String name;
	private String cover;
	private String description;
	private String duration; //Duration
	private String releaseDate; //LocalDate
	private String genre;
	private String recordLabel;
	
    // BUILDERS
    public Album(String name, String cover, String description, String duration, String releaseDate, String genre, String recordLabel) {
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
    
    public static Album createAlbum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating a new Album:");

        System.out.print("Enter Album Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Album Cover: ");
        String cover = scanner.nextLine();

        System.out.print("Enter Album Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Album Duration: ");
        String duration = scanner.nextLine();

        System.out.print("Enter Release Date (YYYY-MM-DD): ");
        String releaseDate = scanner.nextLine();

        System.out.print("Enter Album Genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter Record Label: ");
        String recordLabel = scanner.nextLine();

    
        Album newAlbum = new Album(name, cover, description, duration, releaseDate, genre, recordLabel);

        System.out.println("New Album created successfully!");
        return newAlbum;
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
	
	public static ArrayList<Album> updateAlbum(ArrayList<Album> albums, String name,String newName , String cover, String description, String duration, String releaseDate, String genre, String recordLabel){
		for (int i = 0; i < albums.size(); i++) {
	        if (albums.get(i).getName() == name) {
	            if(newName==null) {
	            }else {
	            	albums.get(i).name = newName;
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