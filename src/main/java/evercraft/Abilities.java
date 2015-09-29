package evercraft;

public class Abilities {

	private static final int MIN_ABILITY = 1;
	private static final int MAX_ABILITY = 20;
	private int strength = 10;
	private int dexterity = 10;
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int newStrength) {
		if (isOutOfBounds(newStrength)) {
			this.strength = resetAbility(newStrength);
		} else {
			this.strength = newStrength;
		}
	}
	
	public void setDexterity(int newDexterity) {
		if (isOutOfBounds(newDexterity)) {
			this.dexterity = resetAbility(newDexterity);
		} else {
			this.dexterity = newDexterity;
		}
		
	}

	private boolean isOutOfBounds(int newStrength) {
		return newStrength > 20 || newStrength < 1;
	}
	
	private int resetAbility(int ability) {
		if (ability > 20){
			return MAX_ABILITY;
		} else {
			return MIN_ABILITY;
		} 
	}

	public int getDexterity() {
		return dexterity;
	}

	public int getConstitution() {
		return 10;
	}

	public int getWisdom() {
		return 10;
	}

	public int getIntelligence() {
		return 10;
	}

	public int getCharisma() {
		return 10;
	}

	


}
