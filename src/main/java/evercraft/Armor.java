package evercraft;

public class Armor {
	private Integer armorPoints;
	private Integer hitPoints;

	public Armor() {
		this.armorPoints = 10;
		this.hitPoints = 5;
	}

	public Integer getArmorPoints() {
		return armorPoints;
	}
	
	public void setArmorPoints(Integer armor) {
		this.armorPoints = armor;
	}
	
	public Integer getHitPoints() {
		return hitPoints;
	}
	
	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}
}
