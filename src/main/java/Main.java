public class Main {


    public static void main(String[] args) {

        GameBackbone gameBackbone = new GameBackbone();
        Grapics grapics = new Grapics(gameBackbone);
        GamePlayLoop gamePlayLoop = new GamePlayLoop(gameBackbone, grapics);


        gamePlayLoop.gamePlay();

    }

}
