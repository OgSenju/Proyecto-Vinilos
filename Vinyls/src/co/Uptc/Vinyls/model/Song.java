package co.Uptc.Vinyls.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Song {
	private String name;
	private String duration;
	
	public Song (String name, String duration) {
		this.name = name;
		this.duration = duration;
	}
	
	//Set
	public void setName(String name) {
        this.name = name;
    }
	public void setDuration(String duration) {
        this.duration = duration;
    }
	
	//Get
	public String getName() {
        return name;
    }
	public String getDuration() {
    	return duration;
    }
	
	public static Song createSong() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating a new Song:");
        
        System.out.print("Enter song name: ");
        String name = scanner.nextLine();

        System.out.print("Enter song duration: ");
        String duration = scanner.nextLine();

        System.out.println("New Song created successfully!");
        
        Song newSong = new Song(name,duration);
        return newSong;
    }
	
	public static ArrayList<Song> uptadeSong(ArrayList<Song> songs, String name, String newName, String duration){
		for(int i = 0; i<songs.size(); i++) {
			if (songs.get(i).name.equals(name)) {
				if(newName != null) {
					songs.get(i).name = newName;
				}
				if (duration != null) {
					songs.get(i).duration = duration;
				}
			}
		}
		return songs;
	}
	
	public static void listSongs(ArrayList<Song> songs) {
	    if (songs.isEmpty()) {
	        System.out.println("No songs available.");
	    } else {
	        songs.sort(Comparator.comparing(Song::getName)); 

	        System.out.print("List of Songs (Alphabetical Order by Name):"+"\n");

	        for (Song song : songs) {
	            System.out.print("Name: " + song.getName() + ", Duration: " + song.getDuration()+"\n");
	        }
	    }
	}
	
	public static ArrayList<Song> deleteSong(String name, ArrayList<Song> songs) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(name)) {
                songs.remove(i);
                System.out.println("Song deleted successfully.");
                return songs;
            }
        }
        System.out.println("The song does not exist. Could not delete.");
        return songs;
    }
}
