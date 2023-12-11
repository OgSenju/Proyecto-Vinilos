package co.Uptc.Vinyls.view;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
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
	    public LocalDate enterNewBirthDate() {
	        System.out.print("Enter new musician birth date (press Enter to keep the current release date, get into in format(YYYY-MM-DD) Ejem: 2023-12-11): ");
	        String birthStr = scan.nextLine();
	        if(birthStr.isEmpty())return null;
	        return formatReleaseDate(birthStr);
	    }
	    public String enterNewDescription() {
	        System.out.print("Enter new musician description (press Enter to keep the current description): ");
	        return scan.nextLine().trim();
	    }
	    
	    LocalDate formatReleaseDate(String birthDateStr) {
	    	boolean formatCorrect = false;
	    	LocalDate birthFormat = null;
	    	while(!formatCorrect){
	            try {
	                birthFormat = LocalDate.parse(birthDateStr);
	                formatCorrect = true;
	            } catch (DateTimeParseException e) {
	                System.err.println("Error entering date. Make sure you are using the correct format (YYYY-MM-DD).");
	            }
	            if(formatCorrect==false)birthDateStr = scan.nextLine();

	        }
	    	return birthFormat;
	    }
}
