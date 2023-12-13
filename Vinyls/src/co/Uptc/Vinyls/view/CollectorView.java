package co.Uptc.Vinyls.view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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
	
	public void viewDetailsCollector(ArrayList<Collector> collectors, String name) {
    	if (collectors.isEmpty()) {
            System.out.println("No collectors available.");
        } else {
        	for (Collector collector : collectors) {
        		if(collector.getName().equals(name)) {
             	   System.out.println("Name: " + collector.getName());
             	   System.out.println("Telephone: " + collector.getTelephone());
             	   System.out.println("Email: " + collector.getEmail());
             	   return;
                }
                
             }
         	System.out.println("\n Non-existent collector");
         }
    }
	
	public Collector createCollector() {
    	System.out.println("Register collector: ");

        System.out.print("Enter collector name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter collector password: ");
        String password = sc.nextLine();
        
        System.out.print("Enter collector telephone: ");
        String telephone = sc.nextLine();

        System.out.print("Enter collector email: ");
        String email = sc.nextLine();
        
        System.out.println("New collector successfully registered!");
    	return new Collector(name, telephone, email, password);
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
