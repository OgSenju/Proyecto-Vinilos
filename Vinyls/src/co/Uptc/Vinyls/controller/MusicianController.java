package co.Uptc.Vinyls.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import co.Uptc.Vinyls.model.Musician;
import co.Uptc.Vinyls.view.MusicianView;

public class MusicianController {
	private ArrayList<Musician> musicians;
    private MusicianView musicianView;
    
	public MusicianController(ArrayList<Musician> musicians, MusicianView musicianView) {
		this.musicians = musicians;
		this.musicianView = musicianView;
	}
    
	public void updateMusician(String name) {
        for (Musician musician : musicians) {
            if (musician.getName().equals(name)) {
                String newName = musicianView.enterNewName();
                LocalDate newBirthDate = musicianView.enterNewBirthDate();
                String newImage = musicianView.enterNewImage();
                String newDescription = musicianView.enterNewDescription();

                if (!newName.isEmpty()) {
                    musician.setName(newName);
                }
                if (!newImage.isEmpty()) {
                    musician.setImage(newImage);
                }
                if (newBirthDate != null) {
                    musician.setBirthDate(newBirthDate);
                }
                if (!newDescription.isEmpty()) {
                    musician.setDescription(newDescription);
                }
                System.out.println("Musician updated successfully!");
                return;
            }
        }

        System.out.println("Musician not found.");
    }
	
	public void deleteBand() {
        String nameToDelete = musicianView.enterMusicianToDelete();

        for (int i = 0; i < musicians.size(); i++) {
            if (musicians.get(i).getName().equals(nameToDelete)) {
                musicians.remove(i);
                System.out.println("Musician deleted successfully.");
                return;
            }
        }

        System.out.println("The musician does not exist. Could not delete.");
    }
}
