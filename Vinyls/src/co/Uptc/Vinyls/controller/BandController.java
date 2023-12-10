package co.Uptc.Vinyls.controller;

import java.util.ArrayList;

import co.Uptc.Vinyls.model.Band;
import co.Uptc.Vinyls.view.BandView;

public class BandController {
	private ArrayList<Band> bands;
    private BandView bandView;
    
	public BandController(ArrayList<Band> bands, BandView bandView) {
		this.bands = bands;
		this.bandView = bandView;
	}
    
	public void updateBand(String name) {
        for (Band band : bands) {
            if (band.getName().equals(name)) {
                String newName = bandView.enterNewName();
                String newCreationDate = bandView.enterNewCreationDate();
                String newImage = bandView.enterNewImage();
                String newDescription = bandView.enterNewDescription();

                if (!newName.isEmpty()) {
                    band.setName(newName);
                }
                if (!newImage.isEmpty()) {
                    band.setImage(newImage);
                }
                if (!newCreationDate.isEmpty()) {
                    band.setCreationDate(newCreationDate);
                }
                if (!newDescription.isEmpty()) {
                    band.setDescription(newDescription);
                }
                System.out.println("Band updated successfully!");
                return;
            }
        }

        System.out.println("Band not found.");
    }
	
	public void deleteBand() {
        String nameToDelete = bandView.enterBandToDelete();

        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getName().equals(nameToDelete)) {
                bands.remove(i);
                System.out.println("Band deleted successfully.");
                return;
            }
        }

        System.out.println("The band does not exist. Could not delete.");
    }
}
