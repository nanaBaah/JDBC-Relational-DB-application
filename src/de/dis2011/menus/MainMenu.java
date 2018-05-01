package de.dis2011.menus;

import de.dis2011.FormUtil;
import de.dis2011.Menu;
import de.dis2011.data.Makler;

public class MainMenu {
	/**
	 * Zeigt das Hauptmen�
	 */
	public static void showMainMenu() {
		//Men�optionen
		final int MENU_MAKLER = 1;
		final int MENU_ESTATE = 2;
		final int QUIT = 0;
		
		//Erzeuge Men�
		Menu mainMenu = new Menu("Main Menu");
		mainMenu.addEntry("Estate Agent Management", MENU_MAKLER);			
		mainMenu.addEntry("Estate Management", MENU_ESTATE);
		mainMenu.addEntry("Quit", QUIT);
		
		//Verarbeite Eingabe												// Process input
		while(true) {
			int response = mainMenu.show();
			
			switch(response) {
				case MENU_MAKLER:
					MaklerMenu.showMaklerMenu();
					break;
				case MENU_ESTATE:
					System.out.println("Please login to Estate Management services:");
					String login = FormUtil.readString("Login");
					String password = FormUtil.readString("Password");
					Makler makler = Makler.login(login, password);
					
					if (makler != null) {
						new EstateMenu(makler).showEstateMenu();
					} else {
						System.out.println("Wrong login info");
					}
					break;
				case QUIT:
					return;
			}
		}
	}
}
