package co.Uptc.Vinyls.Runner;

import java.util.ArrayList;

import co.Uptc.Vinyls.controller.CollectorController;
import co.Uptc.Vinyls.controller.LoginController;
import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.model.Collector;
import co.Uptc.Vinyls.model.Song;
import co.Uptc.Vinyls.view.AlbumView;
import co.Uptc.Vinyls.view.BandView;
import co.Uptc.Vinyls.view.CollectorView;
import co.Uptc.Vinyls.view.LoginView;
import co.Uptc.Vinyls.view.MusicianView;
import co.Uptc.Vinyls.view.PerformerView;
import co.Uptc.Vinyls.view.SongView;

public class Main {

	public static void main(String[] args) {
		ArrayList<Collector> collectors = new ArrayList<>();
		
		
		//VIEW
		LoginView loginView = new LoginView();
		CollectorView collectorView = new CollectorView();
		AlbumView albumView = new AlbumView();
		BandView bandView = new BandView();
		MusicianView musicianView = new MusicianView();
		PerformerView performerView = new PerformerView();
		SongView songView = new SongView();
		
		//CONTROLLER
		CollectorController collectorController = new CollectorController(collectors, collectorView);
		LoginController loginController = new LoginController(loginView, collectorController);
		
		String userName = "";
		while(true) {
			Object actionStart = loginController.performAction();
			if(actionStart == null) continue;
			if(actionStart.equals("isEmpty")) {
				System.out.println("There are no registered collectors");
				continue;
			}
			if(actionStart .equals("Visitor")) {
				userName = "Visitor";
				break;
			}
			if(actionStart.equals("Exit")) {
				System.exit(0);
			}else if(actionStart.equals("Created")){
				continue;
			}else {
				userName = (String) actionStart;
				break;
			}
		}
		System.out.print("\n\nHello, "+ userName);
		
	}
	
}
