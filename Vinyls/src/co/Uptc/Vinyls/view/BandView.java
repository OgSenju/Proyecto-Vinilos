package co.Uptc.Vinyls.view;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
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
    public LocalDate enterNewCreationDate() {
        System.out.print("Enter new band creation date (press Enter to keep the current release date, get into in format(YYYY-MM-DD) Ejem: 2023-12-11): ");
        String creationStr = scan.nextLine();
        if(creationStr.isEmpty())return null;
        return formatCreationDate(creationStr);
    }
    public String enterNewDescription() {
        System.out.print("Enter new band description (press Enter to keep the current description): ");
        return scan.nextLine().trim();
    }
    
    LocalDate formatCreationDate(String creationDateStr) {
    	boolean formatCorrect = false;
    	LocalDate creationFormat = null;
    	while(!formatCorrect){
            try {
            	creationFormat = LocalDate.parse(creationDateStr);
                formatCorrect = true;
            } catch (DateTimeParseException e) {
                System.err.println("Error entering date. Make sure you are using the correct format (YYYY-MM-DD).");
            }
            if(formatCorrect==false)creationDateStr = scan.nextLine();

        }
    	return creationFormat;
    }
    
}
