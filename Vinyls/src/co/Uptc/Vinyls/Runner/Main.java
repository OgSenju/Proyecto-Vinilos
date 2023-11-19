package co.Uptc.Vinyls.Runner;

import java.util.ArrayList;

import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.model.Song;

public class Main {

	public static void main(String[] args) {
		Song s1 = new Song("Inkspots","48second");
		
		s1.updateSong("Woman", "12seconds");
		
		System.out.print(s1.getName()+"\n"+s1.getDuration());
	}
	
	public static void listAlbums(ArrayList<Album> albums){
		for(int i = 0; i < albums.size(); i++) {
			System.out.print("Name: "+albums.get(i).getName());
			System.out.print("Artist/Band: "+albums.get(i).getCover());
			System.out.print("Genre: "+albums.get(i).getGenre());
			System.out.print("\n");
		}
	}
}
