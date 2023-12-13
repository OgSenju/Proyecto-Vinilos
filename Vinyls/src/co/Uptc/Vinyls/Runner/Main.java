package co.Uptc.Vinyls.Runner;

import java.util.ArrayList;

import co.Uptc.Vinyls.controller.AlbumController;
import co.Uptc.Vinyls.controller.CollectorController;
import co.Uptc.Vinyls.controller.LoginController;
import co.Uptc.Vinyls.controller.MenuFuncStartController;
import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.model.Collector;
import co.Uptc.Vinyls.model.Performer;
import co.Uptc.Vinyls.model.Song;
import co.Uptc.Vinyls.model.Visitor;
import co.Uptc.Vinyls.view.AlbumView;
import co.Uptc.Vinyls.view.BandView;
import co.Uptc.Vinyls.view.CollectorView;
import co.Uptc.Vinyls.view.LoginView;
import co.Uptc.Vinyls.view.MenuFunctionsStartView;
import co.Uptc.Vinyls.view.MusicianView;
import co.Uptc.Vinyls.view.PerformerView;
import co.Uptc.Vinyls.view.SongView;

public class Main {

	public static void main(String[] args) {
		ArrayList<Collector> collectors = new ArrayList<>();
		ArrayList<Performer> performers = new ArrayList<>();
		ArrayList<Album> albums = new ArrayList<>();
		
		//VIEW
		LoginView loginView = new LoginView();
		CollectorView collectorView = new CollectorView();
		AlbumView albumView = new AlbumView();
		BandView bandView = new BandView();
		MusicianView musicianView = new MusicianView();
		PerformerView performerView = new PerformerView(performers);
		SongView songView = new SongView();
		MenuFunctionsStartView mFSV = new MenuFunctionsStartView();
		
		//CONTROLLER
		CollectorController collectorController = new CollectorController(collectors, collectorView);
		LoginController loginController = new LoginController(loginView, collectorController);
		AlbumController albumController = new AlbumController(albums, albumView);
		
		String userName = "";
		Collector collector = new Collector();
		while(true) {
			Object actionStart = loginController.performAction();
			
			if(actionStart == null) continue;
			if(actionStart.equals("isEmpty")) {
				System.out.println("There are no registered collectors");
				continue;
			}
			if(actionStart instanceof Visitor) {
				userName = ((Visitor)actionStart).getName();
				break;
			}
			if(actionStart.equals("Exit")) {
				System.exit(0);
			}else if(actionStart.equals("Created")){
				continue;
			}else {
				collector = ((Collector) actionStart);
				userName = ((Collector) actionStart).getName();
				break;
			}
		}
		if (collector != null) {
			System.out.print("\n\nHello, "+ userName);
			AlbumController albumControllerC = new AlbumController(collector.getAlbumsC(), albumView);
			MenuFuncStartController mFSC = new MenuFuncStartController(mFSV, albumControllerC, albumController, collectorController, performerView);
			mFSC.processOption();
		} else {
			System.out.print("\n\nHello, "+ userName);
		}
		
		
		
		
		
	}
	
}
