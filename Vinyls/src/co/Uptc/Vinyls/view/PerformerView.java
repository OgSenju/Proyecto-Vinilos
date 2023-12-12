package co.Uptc.Vinyls.view;

import java.util.ArrayList;

import co.Uptc.Vinyls.model.Band;
import co.Uptc.Vinyls.model.Musician;
import co.Uptc.Vinyls.model.Performer;

public class PerformerView {
	
	private ArrayList<Performer> performers;
	
	
	
	public PerformerView(ArrayList<Performer> performers) {
		super();
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
	
	
}
