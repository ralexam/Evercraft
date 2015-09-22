package evercraft;

public class Alignment {
	
	private Integer evilAlignment;
	private Integer neutralAlignment;
	private Integer goodAlignment;

	private boolean isGreaterThanUpperBound(Integer alignment) {
		return alignment > 100;
	}

	private boolean isLessThanLowerBound(Integer alignment) {
		return alignment < 0;
	}


	public Integer getGoodAlignment() {
		return goodAlignment;
	}
	
	public void setGoodAlignment(Integer goodAlignment) {
		if (isLessThanLowerBound(goodAlignment)) {
			this.goodAlignment = 0;
		} else if (isGreaterThanUpperBound(goodAlignment)) {
			this.goodAlignment = 100;
		} else {
			this.goodAlignment = goodAlignment;
		}
	}
	
	public Integer getEvilAlignment() {
		return evilAlignment;
	}

	public void setEvilAlignment(Integer evilAlignment) {
		if (isLessThanLowerBound(evilAlignment)) {
			this.evilAlignment = 0;
		} else if (isGreaterThanUpperBound(evilAlignment)) {
			this.evilAlignment = 100;
		} else {
			this.evilAlignment = evilAlignment;
		}
	}

	public Integer getNeutralAlignment() {
		return neutralAlignment;
	}
	
	public void setNeutralAlignment(Integer neutralAlignment) {
		if (isLessThanLowerBound(neutralAlignment)) {
			this.neutralAlignment = 0;
		} else if (isGreaterThanUpperBound(neutralAlignment)) {
			this.neutralAlignment = 100;
		} else {
			this.neutralAlignment = neutralAlignment;
		}
	}
	
}
