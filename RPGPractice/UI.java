package RPGPractice;

import java.util.Scanner;

public class UI {
	static Scanner sc = new Scanner(System.in);

	UI() {
		System.out.println("---Village---");
	};

	static void mainMenu() {

		while (true) {

			System.out.println("\nMAIN MENU");
			System.out.println("1. Creat Fighter");
			System.out.println("2. Show Team Member");
			System.out.println("3. Remove The Fighter");
			System.out.println("4. Serch The Fighter");
			System.out.println("5. Let The !BATTLE! Begin");
			System.out.println("0. End This Epic Battle");
			System.out.print("Enter The Number:");

			int select = sc.nextInt();

			if (select == 1) {

			} else if (select == 2) {

			} else if (select == 3) {

			} else if (select == 4) {

			} else if (select == 5) {

			} else if (select == 0) {
			} else {
				System.out.println("Not a Acceptable selection. RE-Enter the Number.");
				continue;
			}
		}

	}

	void creatFighter() {
		System.out.println("\n*FIGHTER CREAT*");
		System.out.println("1. The Human");
		System.out.println("2. The Cat");
		System.out.println("3. The Dog");
		System.out.println("4. New Creature");
		System.out.println("5. Let The !BATTLE! Begin");
		System.out.println("0. Back to MAIN MENU");
		System.out.print("Enter The Number:");

		int select = sc.nextInt();

		if (select == 1) {
			Human instant = new Human();
			System.out.println(
					"HP" + get + "ATK" + "DEF"

			);

		} else if (select == 2) {

		} else if (select == 3) {

		} else if (select == 4) {

		} else if (select == 5) {

		} else if (select == 0) {
		} else {
			System.out.println("Not a Acceptable selection. RE-Enter the Number.");
			continue;
		}

	}

	void showTeamMeber() {

		System.out.println("Team1:");
		for (Creature c : t1) {
			System.out.print(c.name + ",");
			System.out.println("AND YOU.");

		}

	}

	void battleMenu() {
	}

}
