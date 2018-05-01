package de.dis2011.menus;

import de.dis2011.Menu;
import de.dis2011.data.House;
import de.dis2011.data.Makler;

public class EstateMenu {

	private Makler makler;

	public EstateMenu(Makler makler) {
		this.makler = makler;
	}

	public void showEstateMenu() {
		final int NEW_HOUSE = 1;
		final int EDIT_HOUSE = 2;
		final int REMOVE_HOUSE = 3;
		final int NEW_APARTMENT = 4;
		final int EDIT_APARTMENT = 5;
		final int REMOVE_APARTMENT = 6;
		final int BACK = 0;

		Menu estateMenu = new Menu("Estate Menu");

		estateMenu.addEntry("Create New House", NEW_HOUSE);
		estateMenu.addEntry("Edit House", EDIT_HOUSE);
		estateMenu.addEntry("Delete House", REMOVE_HOUSE);

		estateMenu.addEntry("Create New Apartment", NEW_APARTMENT);
		estateMenu.addEntry("Edit Apartment", EDIT_APARTMENT);
		estateMenu.addEntry("Delete Apartment", REMOVE_APARTMENT);

		estateMenu.addEntry("Back to Main Menu", BACK);

		while (true) {
			int response = estateMenu.show();

			switch (response) {
			case NEW_HOUSE:
				newHouse();
				break;
			case EDIT_HOUSE:
				editHouse();
				break;
			case REMOVE_HOUSE:
				removeHouse();
				break;
			case NEW_APARTMENT:
				newApartment();
				break;
			case EDIT_APARTMENT:
				editApartment();
				break;
			case REMOVE_APARTMENT:
				removeApartment();
				break;
			case BACK:
				return;
			}
		}
	}

	public void newHouse() {
		House house = new House();
		house.update(makler.getId());
		house.save();

		System.out.println(house);
	}

	private static void editHouse() {
		// TODO Auto-generated method stub

	}

	private static void removeHouse() {
		// TODO Auto-generated method stub

	}

	private static void newApartment() {
		// TODO Auto-generated method stub

	}

	private static void editApartment() {
		// TODO Auto-generated method stub

	}

	private static void removeApartment() {
		// TODO Auto-generated method stub

	}

}
