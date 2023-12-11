package co.Uptc.Vinyls.model;

import java.time.Duration;

public class Song {
	private String name;
	private Duration duration;
	
	public Song (String name, Duration duration) {
		this.name = name;
		this.duration = duration;
	}
	
	//Setters
	public void setName(String name) {
        this.name = name;
    }
	public void setDuration(Duration duration) {
        this.duration = duration;
    }
	
	//Getters
	public String getName() {
        return name;
    }
	public Duration getDuration() {
    	return duration;
    }
	
}
