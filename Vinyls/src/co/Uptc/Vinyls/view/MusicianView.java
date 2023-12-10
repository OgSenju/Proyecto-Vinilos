package co.Uptc.Vinyls.view;

import java.util.Scanner;

public class MusicianView {
private Scanner scan;
	
	public MusicianView() {
        this.scan = new Scanner(System.in);
    }
	
	public String enterMusicianToDelete() {
        System.out.print("Enter the name of the musician to delete: ");
        return scan.nextLine().trim();
    }
	
	
	//UPDATE
		public String enterNewName() {
	        System.out.print("Enter new musician name (press Enter to keep the current name): ");
	        return scan.nextLine().trim();
	    }
	    public String enterNewImage() {
	        System.out.print("Enter new musician image (press Enter to keep the current url imgage): ");
	        return scan.nextLine().trim();
	    }
	    public String enterNewBirthDate() {
	        System.out.print("Enter new musician birth date (press Enter to keep the current birth date): ");
	        return scan.nextLine().trim();
	    }
	    public String enterNewDescription() {
	        System.out.print("Enter new musician description (press Enter to keep the current description): ");
	        return scan.nextLine().trim();
	    }
}
