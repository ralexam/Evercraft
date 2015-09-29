package evercraft;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BattleTest {
	Battle underTest;
	Character attacker;
	Character victim;
	
	@Mock
	Dice mockedDice;
	
	@Before
	public void setup() {
		initMocks(this);
		
		underTest = new Battle();
		attacker = new Character();
		victim = new Character();
	}

	@Test
	public void fightShouldDecreaseVitcimsHPIfDiceRolls10() {
		when(mockedDice.roll()).thenReturn(10);
		
		underTest.fight(attacker, victim, mockedDice);
		
		assertThat("Victim's HP should decrease by 1. ", victim.getHitPoints(), is(4));
	}
	@Test
	public void fightShouldNotDecreaseVitcimsHPIfDiceRolls1() {
		when(mockedDice.roll()).thenReturn(1);
		
		underTest.fight(attacker, victim, mockedDice);
		
		assertThat("Victim's HP should not decrease by 1. ", victim.getHitPoints(), is(5));
	}
	
	@Test
	public void fightShouldDecreaseVitcimsHPBy2IfDiceRolls20() {
		when(mockedDice.roll()).thenReturn(20);
		
		underTest.fight(attacker, victim, mockedDice);
		
		assertThat("Victim's HP should decrease by 2. ", victim.getHitPoints(), is(3));
	}
	
	@Test
	public void fightShouldKillVictimWhenHPIs0() {
		victim.setHitPoints(1);
		when(mockedDice.roll()).thenReturn(11);
		
		underTest.fight(attacker, victim, mockedDice);
		
		assertThat("Victim should die", victim.isDead(), is(true));
	}
	
	@Test
	public void characterShouldBeAliveAndReadyToFightUponInception(){
		Assert.assertThat("Victim should be alive",  victim.isDead(), is(false));
	}

}
