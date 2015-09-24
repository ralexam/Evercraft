package evercraft;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArmorTest {
	Armor underTest = new Armor();

	@Test
	public void getArmorReturns10() {
		assertThat("Default Armor should be 10", underTest.getArmorStrength(), is(10));
	}

}
