package RPGPractice;

public abstract class Creature implements Attackable, Edible, Eater {

	String name;
	int hp = 100;

	int atk = 1;
	int def = 1;

	boolean isAlive = true;
	boolean edible = false;



	public boolean checkAlive() {
		if (hp <= 0) {
			isAlive = false;
			System.out.println(name + " has died.");
		}
		return isAlive;
	}

	public abstract void beEaten(Creature eater);

	public abstract void eat(Creature food);

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getAtk() {
		return this.atk;
	}
	
	public int getDef() {
		return this.def;
	}
	
	public void makeSounds() {
	}

}

class Animal extends Creature {

	Animal() {
		this.hp = 110;
		this.atk = 20;

	}

	@Override
	public void attack(Creature target) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void beEaten(Creature eater) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void eat(Creature food) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

class Human extends Animal implements faith {

	Human() {
		this.hp = 100;
		this.atk = 50;
	}

	@Override
	public void thinkAbout(Ideology i) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public String isFaithful(boolean i) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}

class Monster extends Creature {

	Monster() {
		this.hp = 100;
		this.atk = 50;
	}

	@Override
	public void attack(Creature target) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void beEaten(Creature eater) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void eat(Creature food) {
		// TODO 自動生成されたメソッド・スタブ

	}

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
