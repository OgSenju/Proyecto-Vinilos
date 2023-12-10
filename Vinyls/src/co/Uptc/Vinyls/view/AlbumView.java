package co.Uptc.Vinyls.view;

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
    
    public Album createAlbum() {
    	System.out.println("Creating a new Album:");

        System.out.print("Enter album name: ");
        String name = scanner.nextLine();

        System.out.print("Enter album cover: ");
        String cover = scanner.nextLine();

        System.out.print("Enter album description: ");
        String description = scanner.nextLine();

        System.out.print("Enter album duration: ");
        String duration = scanner.nextLine();

        System.out.print("Enter release date (YYYY-MM-DD): ");
        String releaseDate = scanner.nextLine();

        System.out.print("Enter album genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter record label: ");
        String recordLabel = scanner.nextLine();
        
        System.out.println("New Album created successfully!");
    	return new Album(name, cover, description, duration, releaseDate, genre, recordLabel);
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
    public String enterNewDuration() {
        System.out.print("Enter new album duration (press Enter to keep the current duration): ");
        return scanner.nextLine().trim();
    }
    public String enterNewCover() {
        System.out.print("Enter new album cover (press Enter to keep the current cover): ");
        return scanner.nextLine().trim();
    }
    public String enterNewDescription() {
        System.out.print("Enter new album description (press Enter to keep the current description): ");
        return scanner.nextLine().trim();
    }
    public String enterNewReleaseDate() {
        System.out.print("Enter new album release date (press Enter to keep the current release date): ");
        return scanner.nextLine().trim();
    }
    public String enterNewGenre() {
        System.out.print("Enter new album genre (press Enter to keep the current genre): ");
        return scanner.nextLine().trim();
    }
    public String enterNewRecordLabel() {
        System.out.print("Enter new album record label (press Enter to keep the current record label): ");
        return scanner.nextLine().trim();
    }
}
