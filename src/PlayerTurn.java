
public enum PlayerTurn {

	Player_1,
	Player_2,
	END;
	
	private static PlayerTurn pTurn;
	
	public static void setTurn(PlayerTurn pt) {
		pTurn = pt;
	}
	
	public static boolean isState(PlayerTurn pt) {
		
		if(pTurn.equals(pt)) {
			return true;
		}
		
		return false;
	}
	
	public static PlayerTurn getTurn() {
		return pTurn;
	}
	
}
