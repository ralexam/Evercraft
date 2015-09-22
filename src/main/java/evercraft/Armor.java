package evercraft;

public class Armor {
	private Integer armorStrength;
	private Integer hitPoints;

	public Armor() {
		this.armorStrength = 10;
		this.hitPoints = 5;
	}

	public Integer getArmorStrength() {
		return armorStrength;
	}
	
	public void setArmorStrength(Integer armorStrength) {
		this.armorStrength = armorStrength;
	}
	
	public Integer getHitPoints() {
		return hitPoints;
	}
	
	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}
}
