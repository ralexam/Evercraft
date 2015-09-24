package evercraft;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

public class CharacterTest {
	private Character underTest;
	
	@Mock
	Dice mockDice;

	@Before
	public void setup() {
		underTest = new Character();
	}

	@Test
	public void setNameToLunaSoThatGetNameReturnsLuna() {
		String characterName = "Luna";
		underTest.setName(characterName);
		assertThat("Character name should be Luna. ", underTest.getName(), is(characterName));
	}
	
	@Test
	public void isAttackedShouldDecreaseHitPointsByOne() {
		underTest.setArmor(new Armor());
		underTest.setName("Luna");
		
		underTest.isAttacked();
		
		Assert.assertThat("Character's hit points should decrease by one. ", underTest.getHitPoints(), is(4));
	}
	
	@Test
	public void getHitPointsReturns5() {
		assertThat("Default Hit Points should be 5", underTest.getHitPoints(), is(5));
	}
	
	
}
