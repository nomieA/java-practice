package DraftCode.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonnellManagement {

	static Scanner sc = new Scanner(System.in);

	public interface Person {

		String getName();

		int getAge();

		String getRole();

		void printInfo();

	}
	
	static abstract class worker{
		String name;
		int age;
		public String getName() {
			// TODO 自動生成されたメソッド・スタブ
			return this.name;
		}
		
		public int getAge() {
			// TODO 自動生成されたメソッド・スタブ
			return this.age;
		}
	}

	static class Employee extends worker implements Person {


		String department;
		String employeeID;

		




		@Override
		public String getRole() {
			// TODO 自動生成されたメソッド・スタブ
			return "社員";
		}

		@Override
		public void printInfo() {
			System.out.println("名前：" + this.name);
			System.out.println("ID：" + this.employeeID);
			System.out.println("年齢：" + this.age);
			System.out.println("部署：" + this.department + "\n");

		}
	}

	static class Freelancer extends worker implements Person {


		int unitPrice;
		int contractMonths;

		@Override
		public String getName() {
			// TODO 自動生成されたメソッド・スタブ
			return this.name;
		}

		@Override
		public int getAge() {
			// TODO 自動生成されたメソッド・スタブ
			return this.age;
		}

		@Override
		public String getRole() {
			// TODO 自動生成されたメソッド・スタブ
			return "フリーランサー";
		}

		@Override
		public void printInfo() {
			System.out.println("名前：" + this.name);
			System.out.println("年齢：" + this.age);
			System.out.println("契約給料（円）" + this.unitPrice);
			System.out.println("契約期間（月）" + this.contractMonths + "\n");
		}
	}
	
	static class Menu {

		void show() {
			while (true)

			{
				System.out.println("--- 人材管理システム ---");
				System.out.println("１．社員を登録");
				System.out.println("２．フリーランサーを登録");
				System.out.println("３．一覧表示");
				System.out.println("４．名前で検索");
				System.out.println("５．年齢で検索");
				System.out.println("６．削除");
				System.out.println("７．終了");
				int select = sc.nextInt();

				if (select == 1) {

					Employee newEmployee = new Employee();

					System.out.println("登録したい社員の名前：");
					newEmployee.name = sc.next();

					System.out.println("登録したい社員の年齢：");
					newEmployee.age = sc.nextInt();

					System.out.println("登録したい社員の部署：");
					newEmployee.department = sc.next();

					System.out.println("登録したい社員の番号：");
					newEmployee.employeeID = sc.next();

					HRService.addPerson(newEmployee);

				} else if (select == 2) {

					Freelancer newFreelancer = new Freelancer();
					System.out.println("登録したいフリーランサーの名前：");
					newFreelancer.name = sc.next();

					System.out.println("登録したいフリーランサーの年齢：");
					newFreelancer.age = sc.nextInt();

					System.out.println("登録したいフリーランサーの単価（円）：");
					newFreelancer.unitPrice = sc.nextInt();

					System.out.println("登録したいフリーランサーの契約期間（月）：");
					newFreelancer.contractMonths = sc.nextInt();

					HRService.addPerson(newFreelancer);

				} else if (select == 3) {

					HRService.printAll();

				} else if (select == 4) {

					System.out.println("お探したい人材の名前を入力してください：");
					String serchName = sc.next();
					if (HRService.findByName(serchName) == null) {
						System.out.println(serchName + "は見つかりませんでした。");

					} else {
						HRService.findByName(serchName).printInfo();
					}

				} else if (select == 5) {

					System.out.println("お探したい人材の年齢を入力してください：");
					int serchAge = sc.nextInt();
					List<Person> result = new ArrayList<>();
					result = HRService.findByAge(serchAge);
					if (result == null) {
						System.out.println(serchAge + "歳の人は見つかりませんでした。");

					} else {

						for (Person p : result) {
							System.out.println(p.getRole());
							p.printInfo();
						}

					}

				} else if (select == 6) {

					System.out.println("削除したい人材の名前を入力してください：");
					String remove = sc.next();
					if (HRService.removeByName(remove)) {
						System.out.println("削除成功");
						continue;
					} else {
						System.out.println("削除失敗");
					}

				} else if (select == 7) {

					System.out.println("システム終了いたします。お疲れ様です。");
					break;
				} else {
					System.out.println("入力エラー、番号を入れ直して下さい。");
					continue;
				}
			}
		}
	}

	static class HRService {

		private static List<Person> personList = new ArrayList<Person>();

		static void addPerson(Person p) {

			personList.add(p);

		}

		static void printAll() {

			if (personList.isEmpty()) {
				System.out.println("人材無し");
			}

			for (Person p : personList) {
				System.out.println(p.getRole());
				p.printInfo();
			}

		}

		static Person findByName(String name) {
			for (Person p : personList) {
				if (p.getName().equals(name)) {
					return p;
				}
			}
			return null;
		}

		static List<Person> findByAge(int age) {
			List<Person> sameAge = new ArrayList<Person>();

			for (Person p : personList) {
				if (p.getAge() == age) {
					sameAge.add(p);
				}
			}
			if (sameAge.isEmpty()) {
				return null;
			}
			return sameAge;

		}

		static boolean removeByName(String name) {
			List<Person> sameNameStartWith = new ArrayList<>();

			for (Person p : personList) {
				if (p.getName().startsWith(name)) {
					sameNameStartWith.add(p);
				}
			}

			if (sameNameStartWith.isEmpty()) {
				System.out.println(name + "が見つかりませんでした。");
				return false;

			} else if (sameNameStartWith.size() == 1) {
				personList.remove(sameNameStartWith.get(0));
				System.out.println(name + " が削除されました。");
				return true;

			} else {
				System.out.println("お探している" + name + "が複数いらしゃいます。");
				System.out.println("何方にさしますか？");
				for (int i = 0; i < sameNameStartWith.size(); i++) {
					System.out.print((i + 1) + ". ");
					sameNameStartWith.get(i).printInfo();
				}

				while (true) {
					System.out.println("0を入力すると、削除中止にします。");
					System.out.print("削除したい方の番号を入力してください：");

					int choice = sc.nextInt();
					if (choice == 0) {
						System.out.println("削除中止。メインメニューに戻ります。");
						return false;
					} else if (choice >= 1 && choice <= sameNameStartWith.size()) {
						Person toRemove = sameNameStartWith.get(choice - 1);
						personList.remove(toRemove);
						System.out.println(toRemove.getName() + " が削除されました。");
						return true;
					} else {
						System.out.println("入力エラー、番号を入れ直して下さい。");
					}
				}
			}
		}



	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.show();
	}
}
