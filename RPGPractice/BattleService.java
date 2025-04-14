package RPGPractice;

class BattleService {
	static void attack(Creature attacker, Creature target) {
		if (!attacker.isAlive || !target.isAlive)
			return;
		int dmg = attacker.atk - target.def;
		target.hp -= dmg;

		System.out.println(attacker.name + " attacked " + target.name + ".");
		System.out.println("Damage: " + dmg + ".");
		System.out.println(target.name + " HP left: " + target.hp);

		if (target.hp <= 0) {
			target.isAlive = false;
			System.out.println(target.name + " died...");
		}

	}
}