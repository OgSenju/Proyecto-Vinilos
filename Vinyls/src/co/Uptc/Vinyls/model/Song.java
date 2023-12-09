package co.Uptc.Vinyls.model;

public class Song {
	private String name;
	private String duration;
	
	public Song (String name, String duration) {
		this.name = name;
		this.duration = duration;
	}
	
	//Setters
	public void setName(String name) {
        this.name = name;
    }
	public void setDuration(String duration) {
        this.duration = duration;
    }
	
	//Getters
	public String getName() {
        return name;
    }
	public String getDuration() {
    	return duration;
    }
	
}
