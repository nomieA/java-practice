package RPGPractice;

public class RPGscript {

	public static void main(String[] args) {

		Cat catNeko = new Cat("Neko");
		System.out.println(catNeko.name);
		System.out.println(catNeko.hp);
		System.out.println(catNeko.atk);

		Cat catNoName = new Cat();
		System.out.println(catNoName.name);
		System.out.println(catNoName.hp);
		System.out.println(catNoName.atk);

		Dog dogInu = new Dog();
		dogInu.name = "Inu";
		System.out.println(dogInu.name);
		System.out.println(dogInu.hp);
		System.out.println(dogInu.atk);
		
		Animal AnimalArr[] = new Animal[3];
		
		Human me = new Human();
		me.name = "me";
		System.out.println(me.name);
		System.out.println(me.hp);
		System.out.println(me.atk);
		while (me.checkAlive()) {
			BattleService.attack(me, me);

		}

		Monster m = new Monster();
		m.name = "shoggoth";
		

	}
}
