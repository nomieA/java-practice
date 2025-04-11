class Creature {

	String name = "NoName";
	int hp = 100;
	int mp = 100;
	int exp = 0;

	int atk = 1;
	int def = 1;

	boolean isAlive = true;
	boolean edible = false;

	void makeSounds() {
	}

	void eat() {
		System.out.println(this.name + " I am eating.");
	}

	void walk() {
		System.out.println(this.name + " is walking.");
	}

	void sleep() {
		System.out.println(this.name + " is selpping.");
	}

	public boolean checkAlive() {
		if (hp <= 0) {
			isAlive = false;
			System.out.println(name + " has died.");
		}
		return isAlive;
	}

}

class Animal extends Creature {

	Animal() {
		this.hp = 110;
		this.atk = 20;
	}

}

class Human extends Creature {

}

class Monster extends Creature {

}

class Cat extends Animal {

	public Cat(String name) {
		this.name = name;
		this.hp = 150;
		this.atk = 30;
	}

	public Cat() {
		this.hp = 120;
		this.atk = 20;
	}

}

class Dog extends Animal {

	Dog() {
		this.hp = 100;
		this.atk = 50;
	}

	public Dog(String name) {
		this.name = name;
		this.hp = 100;
		this.atk = 50;

	}
}

class BattleService {
	void attack(Creature attacker, Creature target) {
		if (!attacker.isAlive || !target.isAlive)
			return;

		target.hp -= attacker.atk;

		System.out.println(attacker.name + " attacked " + target.name + ".");
		System.out.println("Damage: " + attacker.atk);
		System.out.println(target.name + " HP left: " + target.hp);

		if (target.hp <= 0) {
			target.isAlive = false;
			System.out.println(target.name + " died...");
		}

	}
}

public class ClassPracticeCatAndDog {

	public static void main(String[] args) {

		BattleService fight = new BattleService();

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

		fight.attack(catNeko, dogInu);
		fight.attack(dogInu, catNeko);

		Creature me = new Human();
		me.name = "me";
		System.out.println(me.name);
		System.out.println(me.hp);
		System.out.println(me.atk);
		while (me.checkAlive()) {
			fight.attack(me, me);

		}

	}
}
