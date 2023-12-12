package co.Uptc.Vinyls.view;

import java.util.Scanner;

public class LoginView {
	private Scanner scanner;

	public LoginView() {
		this.scanner = new Scanner(System.in);
	}

	public int Startmenu() {
		int option = 0;
		while (option < 1 || option > 4) {
			System.out.println("1. Login as a collector");
			System.out.println("2. Enter as a visitor");
			System.out.println("3. Register as a collector");
			System.out.println("4. Leave the app");
			System.out.print("Enter the option of the action you want to perform: ");

			option = scanner.nextInt();
			scanner.nextLine();

			if (option < 1 || option > 4)System.out.println("Non-existent option. Try again");
		}
		return option;

	}
	
	public String enterName() {
		System.out.print("Enter name user: ");
		return scanner.nextLine();
	}
	
	public String enterPassword() {
		System.out.print("Enter password: ");
		return scanner.nextLine();
	}
	
}
