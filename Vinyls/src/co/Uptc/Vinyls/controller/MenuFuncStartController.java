package co.Uptc.Vinyls.controller;

import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.model.Performer;
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
			proccesOptionOption1(mFSV.processOption1());
			break;
		case 2:
			albums.getAlbumView().displayAlbumList(albums.getArrayAlbums());
			proccesOptionOption2(mFSV.processOption2());
			break;
		case 3:
			collectors.getCollectorView().displayCollectorList(collectors.getCollectors());
			proccesOptionOption3(mFSV.processOption3());
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
	
	public void proccesOptionOption1(int option) {
		switch(option) {
			case 1:
				albumC.getAlbumView().viewDetailsAlbum(albumC.getArrayAlbums(), mFSV.enterName());
				break;
			case 2:
				albumC.updateAlbum(mFSV.enterName());
				break;
			case 3:
				albumC.deleteAlbum();
				break;
			case 4:
				albumC.createAndAddAlbum();
				break;
			case 5:
				System.exit(0);
				break;
			case 6:
				break;
		}
		
	}
	public void proccesOptionOption2(int option) {
		switch(option) {
			case 1:
				albums.getAlbumView().viewDetailsAlbum(albums.getArrayAlbums(), mFSV.enterName());
				break;
			case 2:
				String name = mFSV.enterName();
				for(Album album: albums.getArrayAlbums()) {
					if(name.equals(album.getName())) {
						albumC.addToList(album);
						System.out.println("\nAlbum added successfully");
						return;
					}
				}
				System.out.println("Non-existent album");
				break;
			case 3:
				System.exit(0);
				break;
			case 4:
				break;
		}
		
	}
	public void proccesOptionOption3(int option) {
		switch(option) {
			case 1:
				String name = mFSV.enterName();
				collectors.getCollectorView().viewDetailsCollector(collectors.getCollectors(), name);
				break;
			case 2:
				System.exit(0);
				break;
			case 3:
				break;
		}
		
	}
	
	public void proccesOptionOption4(int option) {
		switch(option) {
			case 1:
				String name = mFSV.enterName();
				performerView.viewDetailsPerformer(name);
				break;
			case 2:
				System.exit(0);
				break;
			case 3:
				break;
		}
		
	}
	
	
}
