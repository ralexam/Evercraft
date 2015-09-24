package evercraft;

public class Character {

	private String name;
	private Armor armor;
	private Alignment alignment;
	private int hP;
	
	public Character() {
		hP = 5;
	}
	
	public void isAttacked() {
		hP = hP - 1;
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
		return hP;
	}


}
