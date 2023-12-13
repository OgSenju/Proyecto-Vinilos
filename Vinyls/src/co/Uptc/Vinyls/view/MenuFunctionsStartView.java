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
			System.out.print("Enter the option of the action you want to perform: ");
			option = sc.nextInt();
			sc.nextLine();
	
			if (option < 1 || option > 6)System.out.println("Non-existent option. Try again");
		}
		return option;
	}
	
	public int processOption1() {
		int option = 0;
		while (option < 1 || option > 6) {
			System.out.print("\n");
			System.out.println("1. View album details");
			System.out.println("2. Uptade Album");
			System.out.println("3. Delete Album");
			System.out.println("4. Create album");
			System.out.println("5. Exit the program");
			System.out.println("6. Go back");
			System.out.print("Enter the option of the action you want to perform: ");
			option = sc.nextInt();
			sc.nextLine();
	
			if (option < 1 || option > 6)System.out.println("Non-existent option. Try again");
		}
		return option;
	}
	public int processOption2() {
		int option = 0;
		while (option < 1 || option > 4) {
			System.out.print("\n");
			System.out.println("1. View album details");
			System.out.println("2. Add album to my list");
			System.out.println("3. Exit the program");
			System.out.println("4. Go back");
			System.out.print("Enter the option of the action you want to perform: ");
			option = sc.nextInt();
			sc.nextLine();
	
			if (option < 1 || option > 4)System.out.println("Non-existent option. Try again");
		}
		return option;
	}
	public int processOption3() {
		int option = 0;
		while (option < 1 || option > 4) {
			System.out.print("\n");
			System.out.println("1. View collector details");
			System.out.println("2. Exit the program");
			System.out.println("3. Go back");
			System.out.print("Enter the option of the action you want to perform: ");
			option = sc.nextInt();
			sc.nextLine();
	
			if (option < 1 || option > 4)System.out.println("Non-existent option. Try again");
		}
		return option;
	}
	public int processOption4() {
		int option = 0;
		while (option < 1 || option > 4) {
			System.out.print("\n");
			System.out.println("1. View performers details");
			System.out.println("2. Exit the program");
			System.out.println("3. Go back");
			System.out.print("Enter the option of the action you want to perform: ");
			option = sc.nextInt();
			sc.nextLine();
	
			if (option < 1 || option > 4)System.out.println("Non-existent option. Try again");
		}
		return option;
	}
	
}
