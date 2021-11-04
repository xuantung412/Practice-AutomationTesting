package SimpleGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleGameEngineTesting {
	MainGame test01 = new MainGame();

	@Test
	void testCase01() {
		test01.systemRandomNum =1; //Set system chose Paper
		assertEquals("Congraduation, You Win",test01.play(2));//User chose Sic
				
	}
	@Test
	void testCase02() {
		test01.systemRandomNum =1; //Set system chose Paper
		assertEquals("No Luck, You Lose",test01.play(0));//User chose Rock

	}
	@Test
	void testCase03() {
		test01.systemRandomNum =0; //Set system chose Rock
		assertEquals("Congraduation, You Win",test01.play(1));//User chose Paper

	}
	@Test
	void testCase04() {
		test01.systemRandomNum =0; //Set system chose Rock
		assertEquals("No Luck, You Lose",test01.play(2));//User chose Sic

	}
	@Test
	void testCase05() {
		test01.systemRandomNum =2; //Set system chose Sic
		assertEquals("No Luck, You Lose",test01.play(1));//User chose Paper

	}

}
