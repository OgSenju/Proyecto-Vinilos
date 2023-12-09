package co.Uptc.Vinyls.model;

public class Musician implements Performer{
	private String name;
	private String image;
	private String description;
	private String birthDate;
	
	public Musician(String name, String image, String description, String birthDate) {
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
	public String getBirthDate() {
		return birthDate;
	}
	
	public void setbirthDate(String creationDate) {
		this.birthDate = creationDate;
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
