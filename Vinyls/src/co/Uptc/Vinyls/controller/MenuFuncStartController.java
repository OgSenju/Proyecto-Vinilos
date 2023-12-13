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
			mFSV.processOption1();
			break;
		case 2:
			albums.getAlbumView().displayAlbumList(albums.getArrayAlbums());
			mFSV.processOption2();
			break;
		case 3:
			collectors.getCollectorView().displayCollectorList(collectors.getCollectors());
			mFSV.processOption3();
			break;
		case 4:
			performerView.displayPerformerList();
			mFSV.processOption4();
			break;
		case 5:
			System.exit(0);
			break;
		case 6:
			break;
		}
	}
	
	
	
	
}
