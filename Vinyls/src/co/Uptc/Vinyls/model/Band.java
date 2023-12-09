package co.Uptc.Vinyls.model;

public class Band implements Performer{
	private String name;
	private String image;
	private String description;
	private String creationDate;
	
	public Band(String name, String image, String description, String creationDate) {
		this.name = name;
		this.image = image;
		this.description = description;
		this.creationDate = creationDate;
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
	public String getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
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
