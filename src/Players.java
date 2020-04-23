
public class Players {
	
	public static int score1;
	public static int score2;
	public static int gameCount = 0;
	
	public static void startScore() {
		score1 = 0;
		score2 = 0;
	}
	
	public static int max(int p1, int p2) {
		if(p1 > p2) {
			return 1;
		} else if(p1 < p2) {
			return 2;
		} else {
			return 0;
		}
	}

}
