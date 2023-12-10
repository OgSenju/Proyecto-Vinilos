package co.Uptc.Vinyls.view;

import java.util.Scanner;

public class BandView {
	private Scanner scan;
	
	public BandView() {
        this.scan = new Scanner(System.in);
    }
	
	public String enterBandToDelete() {
        System.out.print("Enter the name of the band to delete: ");
        return scan.nextLine().trim();
    }
	
	
	//UPDATE
	public String enterNewName() {
        System.out.print("Enter new band name (press Enter to keep the current name): ");
        return scan.nextLine().trim();
    }
    public String enterNewImage() {
        System.out.print("Enter new band image (press Enter to keep the current url imgage): ");
        return scan.nextLine().trim();
    }
    public String enterNewCreationDate() {
        System.out.print("Enter new band creation date (press Enter to keep the current creation date): ");
        return scan.nextLine().trim();
    }
    public String enterNewDescription() {
        System.out.print("Enter new band description (press Enter to keep the current description): ");
        return scan.nextLine().trim();
    }
    
}
