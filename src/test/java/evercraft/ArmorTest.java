package evercraft;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArmorTest {
	Armor underTest = new Armor();

	@Test
	public void getArmorReturns10() {
		assertThat("Default Armor should be 10", underTest.getArmorPoints(), is(10));
	}
	
	@Test
	public void getHitPointsReturns5() {
		assertThat("Default Hit Points should be 5", underTest.getHitPoints(), is(5));
	}

}
