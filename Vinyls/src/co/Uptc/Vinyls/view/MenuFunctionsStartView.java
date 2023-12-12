package co.Uptc.Vinyls.view;

import java.util.Scanner;

public class MenuFunctionsStartView {
	private Scanner sc;
	
	public MenuFunctionsStartView() {
		this.sc = new Scanner(System.in);
	}
	
	public int displayMenu() {
		int option = 0;
		while (option < 1 || option > 6) {
			System.out.print("\n");
			System.out.println("1. See my albums");
			System.out.println("2. Albums in the app");
			System.out.println("3. Collectors list");
			System.out.println("4. Performers list");
			System.out.println("5. Exit the program");
			System.out.println("6. Sign off");
			option = sc.nextInt();
			sc.nextLine();
	
			if (option < 1 || option > 4)System.out.println("Non-existent option. Try again");
		}
		return option;
	}
}
