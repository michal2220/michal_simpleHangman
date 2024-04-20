import java.util.ArrayList;

public class GamePlayLoop {

    GameBackbone gameBackbone;
    boolean isAvailable = true;

    public GamePlayLoop(GameBackbone gameBackbone) {
        this.gameBackbone = gameBackbone;
    }

    public void gamePlay() {
        ArrayList<String> list = gameBackbone.wordInput();

        System.out.println("Twoje słowo to: " + gameBackbone.getWord());


        System.out.println(list);

        while (!list.isEmpty()) {
            String letter = gameBackbone.letterInput();
            System.out.println("Twoja litera to: " + letter);
            letterChecker(list, letter);
            if (!isAvailable){
                System.out.println("Zła litera");
            }
        }

        System.out.println("WYGRANA!");
        System.out.println(list);
    }

    private boolean letterChecker(ArrayList<String> list, String letter) {
        isAvailable = false;
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i).contains(letter)) {
                isAvailable=true;
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        return isAvailable;
    }


}
