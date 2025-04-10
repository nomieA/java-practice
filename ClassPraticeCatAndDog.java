class Creature {

	String name = "NoName";
	static int hp;
	int mp;
	int exp;

	int atk;
	int def;

	boolean isAlive = true;
	boolean edible = false;

	void attack() {
	}

	void makeSounds() {
	}

	void cast() {
	}

	public void checkAlive() {
		if (hp <= 0) {
			isAlive = false;
			System.out.println(name + " has died.");
		}
	}

}

class Animal extends Creature {

	Animal(){}
}

class Human extends Creature {

}

class Monster extends Creature {

}

class Cat extends Animal {

	public Cat(String name) {
		this.name = name;
		this.hp = 150;
		this.atk = 20;
	}

}

class Dog extends Animal {

	Dog() {
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

public class ClassPraticeCatAndDog {

	public static void main(String[] args) {
		Cat catNeko = new Cat("Neko");
		System.out.println(catNeko.hp);
		System.out.println(catNeko.atk);

		Dog dogInu = new Dog();
		dogInu.name = "Inu";
		System.out.println(dogInu.hp);
		System.out.println(dogInu.atk);

		BattleService fight = new BattleService();

		fight.attack(catNeko, dogInu);
		fight.attack(dogInu, catNeko);
		
		Animal a = new Animal();
		a.checkAlive();
	}

}
