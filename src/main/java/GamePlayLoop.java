import java.util.ArrayList;

public class GamePlayLoop {

    GameBackbone gameBackbone;
    Grapics grapics;
    boolean isAvailable = true;
    int counter = 0;

    public GamePlayLoop(GameBackbone gameBackbone, Grapics grapics) {
        this.gameBackbone = gameBackbone;
        this.grapics = grapics;
    }

    public void gamePlay() {
        ArrayList<String> list = gameBackbone.wordInput();
        System.out.println("Twoje słowo to: " + gameBackbone.getWord());
        while (!list.isEmpty()) {
            String letter = gameBackbone.letterInput();
            checkLetters(list, letter);
            if (!isAvailable) {
                System.out.println("Zła litera");
                counter++;
                grapics.paint(counter);
                if (grapics.looser) {
                    System.out.println("Słowo, którego szukałeś to: " + gameBackbone.getWord());
                    break;
                }
            }
        }
        if (list.isEmpty()) {
            System.out.println("WYGRANA!");
        }
    }

    private boolean checkLetters(ArrayList<String> list, String letter) {
        isAvailable = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(letter)) {
                isAvailable = true;
                list.remove(i);
                i--;
            }
        }
        return isAvailable;
    }

}
