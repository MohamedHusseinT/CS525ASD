package Lab06C.src.main.java.game;


public class GameLevelThree implements IGameLevel {

	Game game;
	public GameLevelThree(Game game) {
		this.game = game;
	}

	public int addPoints(int newPoints) {
		int totalPoints = game.getTotalPoints();
		totalPoints = totalPoints + newPoints * 3;
		return totalPoints;
	}

	public String getLevelName(){
		return "level3";
	}
}

