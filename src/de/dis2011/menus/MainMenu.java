package de.dis2011.menus;

import de.dis2011.Menu;

public class MainMenu {
	/**
	 * Zeigt das Hauptmenü
	 */
	public static void showMainMenu() {
		//Menüoptionen
		final int MENU_MAKLER = 1;
		final int MENU_ESTATE = 2;
		final int QUIT = 0;
		
		//Erzeuge Menü
		Menu mainMenu = new Menu("Main Menu");
		mainMenu.addEntry("Makler-Verwaltung", MENU_MAKLER);				// Broker Management
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
					break;
				case QUIT:
					return;
			}
		}
	}
}
