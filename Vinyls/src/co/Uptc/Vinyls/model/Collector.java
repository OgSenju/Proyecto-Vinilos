package co.Uptc.Vinyls.model;

import java.util.ArrayList;

public class Collector {
	private String name;
	private String telephone;
	private String email;
	private String password;
	private ArrayList<Album> albumsC;
	
	public Collector(String name, String telephone, String email, String password) {
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.password = password;
	}
	
	public Collector() {
		
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Album> getAlbumsC() {
		return albumsC;
	}

	public void setAlbumsC(ArrayList<Album> albumsC) {
		this.albumsC = albumsC;
	}
	
	
}
