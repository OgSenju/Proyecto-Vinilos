package co.Uptc.Vinyls.model;

import java.time.LocalDate;

public class Musician implements Performer{
	private String name;
	private String image;
	private String description;
	private LocalDate birthDate;
	
	public Musician(String name, String image, String description, LocalDate birthDate) {
		this.name = name;
		this.image = image;
		this.description = description;
		this.birthDate = birthDate;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public String getImage() {
		return image;
	}
	@Override
	public String getName() {
		return name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
