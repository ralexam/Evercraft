package evercraft;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class CharacterTest {
	private Character underTest;
	
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
}
