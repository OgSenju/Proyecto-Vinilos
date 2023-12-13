package co.Uptc.Vinyls.view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import co.Uptc.Vinyls.model.Album;

public class AlbumView {
	private Scanner scanner;

    public AlbumView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayAlbumList(ArrayList<Album> albums) {
        if (albums.isEmpty()) {
            System.out.println("No albums available.");
        } else {
            albums.sort(Comparator.comparing(Album::getName));
            System.out.print("List of Songs (Alphabetical Order by Name):\n");

            for (Album album : albums) {
                System.out.print("Name: " + album.getName() + ", Duration: " + album.getDuration() + "\n" +
                		"Artist: " + album.getGenre() + ", Genre: " + album.getGenre() + "\n");
            }
        }
    }
    
    public void viewDetailsAlbum(ArrayList<Album> albums, String name) {
    	if (albums.isEmpty()) {
            System.out.println("No albums available.");
        } else {
        	for (Album album : albums) {
               if(album.getName().equals(name)) {
            	   System.out.println("Name: " + album.getName());
            	   System.out.println("Cover: " + album.getCover());
            	   System.out.println("Description: " + album.getDescription());
            	   System.out.println("Duration: " + album.getDuration());
            	   System.out.println("Release date: " + album.getReleaseDate());
            	   System.out.println("Genre: " + album.getGenre());
            	   System.out.println("Record labe: " + album.getRecordLabel());
            	   PerformerView performerView = new PerformerView(album.getPerformer());
            	   performerView.displayPerformerList();
            	   return;
               }
               
            }
        	System.out.println("\n Non-existent album");
        }
    }
    
    public Album createAlbum() {
    	System.out.println("Creating a new Album:");

        System.out.print("Enter album name: ");
        String name = scanner.nextLine();

        System.out.print("Enter album cover: ");
        String cover = scanner.nextLine();

        System.out.print("Enter album description: ");
        String description = scanner.nextLine();
        
        System.out.print("Enter album duration (in PT#H#M#S format, Ejem: PT3M30S: 3 minutes y 30 seconds.\n"
        		+ "PT1H: 1 hour.): ");
        String durationStr = scanner.nextLine();
        Duration durationFormat = formatDuration(durationStr);
        
        System.out.print("Enter release date (YYYY-MM-DD)(Ejem: 2023-12-11): ");
        String releaseDateFormat = scanner.nextLine();
        LocalDate releaseDate = formatReleaseDate(releaseDateFormat); 

        System.out.print("Enter album genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter record label: ");
        String recordLabel = scanner.nextLine();
        
        System.out.println("New Album created successfully!");
    	return new Album(name, cover, description, durationFormat, releaseDate, genre, recordLabel);
    }
    
    
    public String enterAlbumToDelete() {
        System.out.print("Enter the name of the album to delete: ");
        return scanner.nextLine().trim();
    }
    
    
    //UPDATE
    public String enterNewName() {
        System.out.print("Enter new album name (press Enter to keep the current name): ");
        return scanner.nextLine().trim();
    }
    public Duration enterNewDuration() {
    	System.out.print("Enter new album duration (press Enter to keep the current duration)(in PT#H#M#S format, Ejem: PT3M30S: 3 minutes y 30 seconds.\n"
        		+ "PT1H: 1 hour.): ");
        String durationStr = scanner.nextLine();
        if(durationStr.isEmpty())return null;
        return formatDuration(durationStr);
        
    }
    public String enterNewCover() {
        System.out.print("Enter new album cover (press Enter to keep the current cover): ");
        return scanner.nextLine().trim();
    }
    public String enterNewDescription() {
        System.out.print("Enter new album description (press Enter to keep the current description): ");
        return scanner.nextLine().trim();
    }
    public LocalDate enterNewReleaseDate() {
        System.out.print("Enter new album release date (press Enter to keep the current release date, get into in format(YYYY-MM-DD) Ejem: 2023-12-11): ");
        String releaseStr = scanner.nextLine();
        if(releaseStr.isEmpty())return null;
        return formatReleaseDate(releaseStr);
    }
    public String enterNewGenre() {
        System.out.print("Enter new album genre (press Enter to keep the current genre): ");
        return scanner.nextLine().trim();
    }
    public String enterNewRecordLabel() {
        System.out.print("Enter new album record label (press Enter to keep the current record label): ");
        return scanner.nextLine().trim();
    }
    
    
    //FORMAT DURATION
    Duration formatDuration(String durationStr) {
    	boolean formatCorrect = false;
    	Duration durationFormat = null;
    	while (!formatCorrect){
            try {
                durationFormat =  Duration.parse(durationStr);
                formatCorrect = true;
            } catch (Exception e) {
                System.err.println("Error entering duration. Make sure you use the correct format (PT#H#M#S).");
            }
            if(formatCorrect==false)durationStr = scanner.nextLine();

        }
    	return durationFormat;
    }
    LocalDate formatReleaseDate(String releaseDateStr) {
    	boolean formatCorrect = false;
    	LocalDate releaseFormat = null;
    	while(!formatCorrect){
            try {
                releaseFormat = LocalDate.parse(releaseDateStr);
                formatCorrect = true;
            } catch (DateTimeParseException e) {
                System.err.println("Error entering date. Make sure you are using the correct format (YYYY-MM-DD).");
            }
            if(formatCorrect==false)releaseDateStr = scanner.nextLine();

        }
    	return releaseFormat;
    }
    
}
