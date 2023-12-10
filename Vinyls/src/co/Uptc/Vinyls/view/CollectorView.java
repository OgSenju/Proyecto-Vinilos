package co.Uptc.Vinyls.view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import co.Uptc.Vinyls.model.Album;
import co.Uptc.Vinyls.model.Collector;

public class CollectorView {
	private Scanner sc;
	
	public CollectorView() {
        this.sc = new Scanner(System.in);
    }
	
	public void displayCollectorList(ArrayList<Collector> collectors) {
        if (collectors.isEmpty()) {
            System.out.println("No collectors available.");
        } else {
            collectors.sort(Comparator.comparing(Collector::getName));
            System.out.print("List of collectors (Alphabetical Order by Name):\n");

            for (Collector collector : collectors) {
                System.out.print("Name: " + collector.getName() + ", Telephone: " + collector.getTelephone() +  "\n");
            }
        }
    }
	
	public Collector createCollector() {
    	System.out.println("Creating a new Album:");

        System.out.print("Enter collector name: ");
        String name = sc.nextLine();

        System.out.print("Enter collector telephone: ");
        String telephone = sc.nextLine();

        System.out.print("Enter collector email: ");
        String email = sc.nextLine();
        
        System.out.println("New collector successfully registered!");
    	return new Collector(name, telephone, email);
    }
	
	
	//UPDATE
    public String enterNewName() {
        System.out.print("Enter your new name (press Enter to keep the current name): ");
        return sc.nextLine().trim();
    }
    public String enterNewTelephone() {
        System.out.print("Enter your new telephone (press Enter to keep the current telephone): ");
        return sc.nextLine().trim();
    }
    public String enterNewEmail() {
        System.out.print("Enter your new email (press Enter to keep the current email): ");
        return sc.nextLine().trim();
    }
}
