package RPGPractice;

public class Interface {

}

interface faith {
	abstract void thinkAbout(Ideology i);

	abstract String isFaithful(boolean i);

}

interface Attackable {
	void attack(Creature target);
}

interface Edible {
	void beEaten(Creature eater);

}

interface Eater {
	void eat(Creature food);

}

interface BattleParticipant {
}
