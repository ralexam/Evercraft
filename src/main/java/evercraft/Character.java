package evercraft;

public class Character {

	private String name;
	private Armor armor;
	private Alignment alignment;
	private int hitPoints;
	private boolean isDead;
	
	public Character() {
		hitPoints = 5;
	}
	
	public void isAttacked() {
		hitPoints = hitPoints - 1;
		if (hitPoints <= 0 ){
			isDead = true;
		}
	}
	
	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public boolean isDead() {
		return isDead;
	}


}
