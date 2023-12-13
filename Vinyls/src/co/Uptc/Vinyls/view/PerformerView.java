package co.Uptc.Vinyls.view;

import java.util.ArrayList;

import co.Uptc.Vinyls.model.Band;
import co.Uptc.Vinyls.model.Musician;
import co.Uptc.Vinyls.model.Performer;

public class PerformerView {
	
	private ArrayList<Performer> performers;
	
	
	
	public PerformerView(ArrayList<Performer> performers) {
		this.performers = performers;
	}



	public void displayPerformerList() {
        if (performers.isEmpty()) {
            System.out.println("No musician/band available.");
        } else {
        	System.out.print("List of musician/band:\n");

            for(Performer performer: performers) {
        		if(performer instanceof Musician) {
        			System.out.println("Musician name: " + ((Musician) performer).getName());
        			System.out.println("Image: " + ((Musician) performer).getImage());
        		}else if(performer instanceof Band) {
        			System.out.println("Band name: " + ((Band) performer).getName());
        			System.out.println("Image: " + ((Band) performer).getImage());
        		}
        	}
        }
    }
	
	public void viewDetailsPerformer(String name) {
		if (performers.isEmpty()) {
            System.out.println("No musician/band available.");
        } else {
        	for(Performer performer: performers) {
        		if(name.equals(performer.getName())) {
	        		if(performer instanceof Musician) {
	        			System.out.println("Name: " + ((Musician) performer).getName());
	        			System.out.println("Image: " + ((Musician) performer).getImage());
	        			System.out.println("Description :" + ((Musician) performer).getDescription());
	        			System.out.println("Birht date: " + ((Musician) performer).getBirthDate());
	        		}else if(performer instanceof Band) {
	        			System.out.println("Band name: " + ((Band) performer).getName());
	        			System.out.println("Image: " + ((Band) performer).getImage());
	        			System.out.println("Description: " + ((Band) performer).getDescription());
	        			System.out.println("Creation date: " + ((Band) performer).getCreationDate());
	        		}
        		}
        		return;
        	}
        }
		System.out.println("\n Non-existent performer");
        	
	}
	
	public ArrayList<Performer> getPerformers(){
		return performers;
	}
	
	
}
