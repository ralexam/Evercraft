package evercraft;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class CharacterTest {
	private Character underTest;
	
//	@Mock
//	private Armor armor;
	
	@Before
	public void setup() {
//		initMocks(this);
		underTest = new Character();
//		underTest.setArmor(armor);
	}

	@Test
	public void setNameToLunaSoThatGetNameReturnsLuna() {
		String characterName = "Luna";
		underTest.setName(characterName);
		assertThat("Character name should be Luna. ", underTest.getName(), is(characterName));
	}

	@Test
	public void setEvilAlignmentTo100SoThatGetEvilAlignmentReturns100() {
		Integer evilAlignment = 100;
		underTest.setEvilAlignment(evilAlignment);
		assertThat("Evil alignment should be 100. ", underTest.getEvilAlignment(), is(evilAlignment));
	}
	
	@Test
	public void limitEvilAlignmentToALowerBoundOf0ifInputIsLessThan0(){
		Integer evilAlignment = -50;
		underTest.setEvilAlignment(evilAlignment);
		assertThat("Evil alignment should be 0. ", underTest.getEvilAlignment(), is(0));
	}
	
	@Test 
	public void limitEvilAlignmentToAnUpperBoundOf100ifInputIsMoreThan100(){
		Integer evilAlignment = 5000;
		underTest.setEvilAlignment(evilAlignment);
		assertThat("Evil alignment should be 100. ", underTest.getEvilAlignment(), is(100));
	}

	@Test
	public void setNeutralAlignmentTo45SoThatGetNeutralAlignmentReturns45() {
		Integer neutralAlignment = 45;
		underTest.setNeutralAlignment(neutralAlignment);
		assertThat("Neutral alignment should be 45. ", underTest.getNeutralAlignment(), is(neutralAlignment));
	}
	
	@Test
	public void limitNeutralAlignmentToALowerBoundOf0ifInputIsLessThan0(){
		Integer neutralAlignment = -50;
		underTest.setNeutralAlignment(neutralAlignment);
		assertThat("Neutral alignment should be 0. ", underTest.getNeutralAlignment(), is(0));
	}
	
	@Test
	public void limitNeutralAlignmentToAnUpperBoundOf100ifInputIsMoreThan100(){
		Integer neutralAlignment = 5000;
		underTest.setNeutralAlignment(neutralAlignment);
		assertThat("Neutral alignment should be 100. ", underTest.getNeutralAlignment(), is(100));
	}
	
	@Test
	public void setGoodAlignmentTo45SoThatGetgoodAlignmentReturns45() {
		Integer goodAlignment = 45;
		underTest.setGoodAlignment(goodAlignment);
		assertThat("Neutral alignment should be 45. ", underTest.getGoodAlignment(), is(goodAlignment));
	}
	
	@Test
	public void limitGoodAlignmentToALowerBoundOf0ifInputIsLessThan0(){
		Integer goodAlignment = -50;
		underTest.setGoodAlignment(goodAlignment);
		assertThat("Good alignment should be 0. ", underTest.getGoodAlignment(), is(0));
	}
	
	@Test
	public void limitGoodAlignmentToAnUpperBoundOf100ifInputIsMoreThan100(){
		Integer goodAlignment = 5000;
		underTest.setGoodAlignment(goodAlignment);
		assertThat("Good alignment should be 100. ", underTest.getGoodAlignment(), is(100));
	}
}
