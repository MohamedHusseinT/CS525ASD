package Lab06C.src.main.java.game;


public class GameLevelOne implements IGameLevel {

	Game game;
	public GameLevelOne(Game game) {
		this.game = game;
	}
	public int addPoints(int newPoints) {
		int totalPoints = game.getTotalPoints();
		totalPoints = totalPoints + newPoints;
		if (totalPoints > 10) {
			game.setGameLevel(new GameLevelTwo(game));
			totalPoints = totalPoints + 1;//add 1 bonus point
		}
		return totalPoints;
	}

	public String getLevelName(){

		return "level 1";
	}
}
