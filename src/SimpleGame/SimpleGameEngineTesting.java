package SimpleGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleGameEngineTesting {

	@Test
	void test() {
		MainGame test01 = new MainGame();
		test01.systemRandomNum =1; //Set system chose Paper
		//Check logic
		assertEquals("Congraduation, You Win",test01.play(2));//User chose Sic
		assertEquals("No Luck, You Lose",test01.play(0));//User chose Rock

	}

}
