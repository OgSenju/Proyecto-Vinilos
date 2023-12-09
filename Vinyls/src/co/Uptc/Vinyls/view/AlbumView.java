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
}
