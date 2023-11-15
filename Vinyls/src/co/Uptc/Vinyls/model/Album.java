package co.Uptc.Vinyls.model;

import java.time.Duration;
import java.time.LocalDate;

public class Album {
	private String name;
	private String cover;
	private String description;
	private Duration duration;
	private LocalDate releaseDate;
	private String genre;
	private String recordLabel;
	
    // BUILDER
    public Album(String name, String cover, String description, Duration duration, LocalDate releaseDate, String genre, String recordLabel) {
        this.name = name;
        this.cover = cover;
        this.description = description;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.recordLabel = recordLabel;
    }

    // METHODS GETTER
    public String getName() {
        return name;
    }

    public String getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public String getRecordLabel() {
        return recordLabel;
    }
    
    public Duration getDuration() {
    	return duration;
    }

    // METHODS SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
    
    public void setDuration(Duration duration) {
    	this.duration = duration;
    }
}

