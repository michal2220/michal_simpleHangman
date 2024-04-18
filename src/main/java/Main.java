import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        PrepareGame prepareGame = new PrepareGame();
        GamePlayLoop gamePlayLoop = new GamePlayLoop(prepareGame);


        prepareGame.prepareGame();
        gamePlayLoop.gamePlay();

    }

}
