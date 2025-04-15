package RPGPractice;

import java.util.List;
import java.util.Random;

class BattleService implements BattleParticipant {
	static Random dice = new Random();

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

	static void BattleParticipant() {

	}

	static void fight(List<Creature> t1, List<Creature> t2) {

		
		while (true) {

			attack(t1.get(dice.nextInt(t1.size())), t2.get(dice.nextInt(t2.size())));

			boolean team2Dead = true;
			for (Creature f : t2) {
			    if (f.isAlive) {
			        team2Dead = false;
			        break;
			    }
			}
			if (team2Dead) {
			    System.out.println("No one left in Team2, they lost.");
			    return;
			}

			attack(t2.get(dice.nextInt(t2.size())), t1.get(dice.nextInt(t1.size())));
			
			
			boolean team1Dead = true;
			for (Creature f : t1) {
			    if (f.isAlive) {
			        team1Dead = false;
			        break;
			    }
			}
			if (team1Dead) {
			    System.out.println("No one left in Team1, they lost.");
			    return;
			}
			
		}
	}

}