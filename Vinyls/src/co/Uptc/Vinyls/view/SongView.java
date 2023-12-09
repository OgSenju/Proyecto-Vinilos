package co.Uptc.Vinyls.view;

import co.Uptc.Vinyls.model.Song;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SongView {
	    private Scanner scanner;

	    public SongView() {
	        this.scanner = new Scanner(System.in);
	    }

	    public void displaySongList(ArrayList<Song> songs) {
	        if (songs.isEmpty()) {
	            System.out.println("No songs available.");
	        } else {
	            songs.sort(Comparator.comparing(Song::getName));
	            System.out.print("List of Songs (Alphabetical Order by Name):\n");

	            for (Song song : songs) {
	                System.out.print("Name: " + song.getName() + ", Duration: " + song.getDuration() + "\n");
	            }
	        }
	    }
	    
	    public Song createSong() {
	        System.out.println("Creating a new Song:");

	        System.out.print("Enter song name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter song duration: ");
	        String duration = scanner.nextLine();

	        System.out.println("New Song created successfully!");

	        return new Song(name, duration);
	    }
	    
	    public String enterSongToDelete() {
	        System.out.print("Enter the name of the song to delete: ");
	        return scanner.nextLine().trim();
	    }
	    
	    public String enterNewName() {
	        System.out.print("Enter new song name (press Enter to keep the current name): ");
	        return scanner.nextLine().trim();
	    }

	    public String enterNewDuration() {
	        System.out.print("Enter new song duration (press Enter to keep the current duration): ");
	        return scanner.nextLine().trim();
	    }
}

