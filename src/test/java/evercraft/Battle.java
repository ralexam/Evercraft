package evercraft;

public class Battle {

	public void fight(Character attacker, Character victim, Dice dice) {
		Character nextVictim = victim;
		if (dice.roll() >= 10) {
			nextVictim.isAttacked();
		}
		if (dice.roll() == 20) {
			nextVictim.isAttacked();
		} 
		
	}

}
