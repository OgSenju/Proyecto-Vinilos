package co.Uptc.Vinyls.controller;

import co.Uptc.Vinyls.view.MenuFunctionsStartView;
import co.Uptc.Vinyls.view.PerformerView;

public class MenuFuncStartController {
	MenuFunctionsStartView mFSV;
	AlbumController albumC;
	AlbumController albums;
	CollectorController collectors;
	PerformerView performerView;
	
	public MenuFuncStartController(MenuFunctionsStartView mFSV, AlbumController albumC, AlbumController albums, CollectorController collectors,
			PerformerView performerView) {
		this.mFSV = mFSV;
		this.albumC = albumC;
		this.albums = albums;
		this.collectors = collectors;
		this.performerView = performerView;
	}
	
	public void processOption() {
		int option = mFSV.displayMenu();
		switch(option) {
		case 1:
			albumC.getAlbumView().displayAlbumList(albumC.getArrayAlbums());
			break;
		case 2:
			albums.getAlbumView().displayAlbumList(albums.getArrayAlbums());
			break;
		case 3:
			collectors.getCollectorView().displayCollectorList(collectors.getCollectors());
			break;
		case 4:
			performerView.displayPerformerList();
			break;
		case 5:
			System.out.print("Exit");
			break;
		case 6:
			System.out.print("Sign off");
			break;
		}
	}
	
	
	
	
}
