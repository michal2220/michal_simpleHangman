public class Main {


    public static void main(String[] args) {

        GameBackbone gameBackbone = new GameBackbone();
        GamePlayLoop gamePlayLoop = new GamePlayLoop(gameBackbone);


        gamePlayLoop.gamePlay();

    }

}
