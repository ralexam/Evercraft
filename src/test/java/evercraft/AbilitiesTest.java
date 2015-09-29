package evercraft;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AbilitiesTest {
	
	Abilities underTest;
	
	@Before
	public void setup() {
		underTest = new Abilities(); 
	}

	@Test
	public void abilitiesShouldDefaultTo10() {
		assertThat("Strength should default to 10.", underTest.getStrength(), is(10));
		assertThat("Dexterity should default to 10.", underTest.getDexterity(), is(10));
		assertThat("Constitution should default to 10.", underTest.getConstitution(), is(10));
		assertThat("Wisdom should default to 10.", underTest.getWisdom(), is(10));
		assertThat("Intelligence should default to 10.", underTest.getIntelligence(), is(10));
		assertThat("Charisma should default to 10.", underTest.getCharisma(), is(10));
	}
	
	@Test
	public void shouldBeAbleToSetStrengthTo11(){
		underTest.setStrength(11);
		assertThat("Should set strength to 11", underTest.getStrength(), is(11));
	}

	@Test
	public void strengthShouldNotPass20(){
		underTest.setStrength(25);
		assertThat("Strength cannot be greater than 20. ", underTest.getStrength(), is(20));
	}
	
	@Test
	public void strengthShouldNotBeLessThan0(){
		underTest.setStrength(-44);
		assertThat("Strength cannot be less than 1. ", underTest.getStrength(), is(1));
	}
	
	@Test
	public void shouldBeAbleToSetDexterityTo11(){
		underTest.setDexterity(11);
		assertThat("Should set dexterity to 11", underTest.getDexterity(), is(11));
	}
	
	@Test
	public void dexterityShouldNotPass20(){
		underTest.setDexterity(25);
		assertThat("Dexterity cannot be greater than 20. ", underTest.getDexterity(), is(20));
	}
	
	@Test
	public void dexterityShouldNotBeLessThan0(){
		underTest.setDexterity(-44);
		assertThat("Dexterity cannot be less than 1. ", underTest.getDexterity(), is(1));
	}
}
