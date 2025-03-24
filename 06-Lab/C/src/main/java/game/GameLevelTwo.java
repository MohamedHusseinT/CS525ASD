package Lab06C.src.main.java.game;


public class GameLevelTwo implements IGameLevel {

	Game game;
	public GameLevelTwo(Game game) {
		this.game = game;
	}

	public int addPoints( int newPoints) {
		int totalPoints = game.getTotalPoints();
		totalPoints = totalPoints + newPoints*2;
		if (totalPoints> 20){
			game.setGameLevel(new GameLevelThree(game));
			totalPoints = totalPoints + 2;//bonus
		}
		return totalPoints;
	}

	public String getLevelName(){

		return "level2";
	}
}
