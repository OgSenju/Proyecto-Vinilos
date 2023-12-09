package co.Uptc.Vinyls.model;

public class Collector {
	private String name;
	private String telephone;
	private String email;
	
	public Collector(String name, String telephone, String email) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
