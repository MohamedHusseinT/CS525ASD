package Lab06C.src.main.java.game;

public class GameLevelTwoFive  implements IGameLevel{

    Game game;
    public GameLevelTwoFive(Game game) {
        this.game = game;
    }

    @Override
    public int addPoints(int newPoints) {
        int totalPoints = game.getTotalPoints();
        totalPoints = totalPoints + newPoints * 2;
        if (totalPoints >= 20) {
            game.setGameLevel(new GameLevelThree(game));
        }
        return totalPoints;
    }

    @Override
    public String getLevelName() {
        return "Level2_5";
    }
}
