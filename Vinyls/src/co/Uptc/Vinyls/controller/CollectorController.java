package co.Uptc.Vinyls.controller;

import java.util.ArrayList;

import co.Uptc.Vinyls.model.Collector;
import co.Uptc.Vinyls.view.CollectorView;


public class CollectorController {
	private ArrayList<Collector> collectors;
	private CollectorView collectorView;
	
	public CollectorController(ArrayList<Collector> collectors, CollectorView collectorView) {
		this.collectors = collectors;
		this.collectorView = collectorView;
	}
	
	public void createAndAddCollector() {
		Collector newCollector = collectorView.createCollector();
		collectors.add(newCollector);
	}
	
	public void updateCollector(String name) {
		for(Collector collector : collectors) {
			if(collector.getName().equals(name)) {
				String newName = collectorView.enterNewName();
				String newTelephone = collectorView.enterNewTelephone();
				String newEmail = collectorView.enterNewEmail();
				if(!newName.isEmpty()) {
					collector.setName(newName);
				}
				if(!newTelephone.isEmpty()) {
					collector.setTelephone(newTelephone);
				}
				if(!newEmail.isEmpty()) {
					collector.setEmail(newEmail);
				}
				
				System.out.println("Collector updated successfully!");
                return;
			}
		}
		
		System.out.println("Collector not found.");
	}
	
	public void deleteCollector(ArrayList<Collector> collectors, Collector collector) {
		collectors.remove(collector);
		System.out.println("Profile deleted successfully");
	}
	
	public ArrayList<Collector> getCollectors(){
		return collectors;
	}
	
	public CollectorView getCollectorView() {
		return collectorView;
	}
}
