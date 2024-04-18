public class GamePlayLoop {

    PrepareGame prepareGame;

    public void gamePlay() {
        for (char ch : prepareGame.getList())
            System.out.println(ch);
    }

    public GamePlayLoop(PrepareGame prepareGame) {
        this.prepareGame = prepareGame;
    }
}
