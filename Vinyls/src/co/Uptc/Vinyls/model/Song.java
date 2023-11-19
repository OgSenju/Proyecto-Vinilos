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
	
	public void updateSong(String name, String duration){
		if(name != null) {
			this.name = name;
		}
		if(duration != null) {
			this.duration = duration;
		}
	}
}
