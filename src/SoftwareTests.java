import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoftwareTests {

	@Test
	void reliabilityTests() {
		TriviaGame.main(null);
		QuestionList.read();
		
		for(int i = 100; i < QuestionList.USQ.size() * 100; i += 100) {
			assertTrue(QuestionList.USQ.get(i), QuestionList.USQ.get(i).endsWith("?"));
		}
		
		for(int i = 100; i < QuestionList.UMD.size() * 100; i += 100) {
			assertTrue(QuestionList.UMD.get(i), QuestionList.UMD.get(i).endsWith("?"));
		}
		
		for(int i = 100; i < QuestionList.CS.size() * 100; i += 100) {
			assertTrue(QuestionList.CS.get(i), QuestionList.CS.get(i).endsWith("?"));
		}
		
		for(int i = 100; i < QuestionList.GEO.size() * 100; i += 100) {
			assertTrue(QuestionList.GEO.get(i), QuestionList.GEO.get(i).endsWith("?"));
		}
		
		for(int i = 100; i < QuestionList.MOV.size() * 100; i += 100) {
			assertTrue(QuestionList.MOV.get(i), QuestionList.MOV.get(i).endsWith("?"));
		}
		
	}
	
	@Test
	void completenessTest() {
		TriviaGame.main(null);
		int s1 = Players.score1;
		int s2 = Players.score2;
		
		Players.addPoints(300);
		
		assertEquals(s1 + 300, Players.score1);
		
		PlayerTurn.setTurn(PlayerTurn.Player_2);
		
		Players.removePoints(300);
		
		assertEquals(s2 - 150, Players.score2);
	}

}
