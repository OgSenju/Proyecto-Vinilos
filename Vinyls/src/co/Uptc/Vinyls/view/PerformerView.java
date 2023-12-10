package co.Uptc.Vinyls.view;

import java.util.ArrayList;

import co.Uptc.Vinyls.model.Band;
import co.Uptc.Vinyls.model.Musician;
import co.Uptc.Vinyls.model.Performer;

public class PerformerView {
	
	public void displayPerformerList(ArrayList<Performer> performers) {
        if (performers.isEmpty()) {
            System.out.println("No musician/band available.");
        } else {
            
        	System.out.print("List of musician/band:\n");

            for(Performer performer: performers) {
        		if(performer instanceof Musician) {
        			System.out.println("Name: " + ((Musician) performer).getName());
        			System.out.println("Image: " + ((Musician) performer).getImage());
        		}else if(performer instanceof Band) {
        			System.out.println("Name: " + ((Band) performer).getName());
        			System.out.println("Image: " + ((Band) performer).getImage());
        		}
        	}
        }
    }
	
	
}
