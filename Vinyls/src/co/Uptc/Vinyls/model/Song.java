package co.Uptc.Vinyls.model;

import java.util.ArrayList;

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
	
	public static ArrayList<Song> uptadeSong(ArrayList<Song> songs, String name, String newName, String duration){
		for(int i = 0; i<songs.size(); i++) {
			if (songs.get(i).name.equals(name)) {
				if(newName != null) {
					songs.get(i).name = newName;
				}
				if(duration != null) {
					songs.get(i).duration = duration;
				}
			}
		}
		return songs;
	}
}
