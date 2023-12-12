package co.Uptc.Vinyls.controller;


import co.Uptc.Vinyls.model.Collector;
import co.Uptc.Vinyls.view.LoginView;

public class LoginController {
	private LoginView loginView;
	private CollectorController collectorController;

	public LoginController(LoginView loginView, CollectorController collectorController) {
		this.loginView = loginView;
		this.collectorController = collectorController;
	}

	public String performAction() {
		int option = loginView.Startmenu();
        switch (option) {
            case 1:
                String nameUser = loginView.enterName();
                String password = loginView.enterPassword();
                if(collectorController.getCollectors().isEmpty()) return "isEmpty";
                for (Collector collector: collectorController.getCollectors()) {
                	if(collector.getName().equals(nameUser) && collector.getPassword().equals(password))return nameUser;
                }
                System.out.println("Non-existent user or incorrect user/password");
                break;
            case 2:
            	return "Visitor";
            case 3:
            	collectorController.createAndAddCollector();
            	return "Created";
            case 4:
            	return "Exit";
        }
		return null;
		
    }
}
