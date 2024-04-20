import java.util.ArrayList;

public class GamePlayLoop {

    GameBackbone gameBackbone;

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
            removeLetter(list, letter);
        }

        System.out.println("WYGRANA!");
        System.out.println(list);
    }

    private void removeLetter(ArrayList<String> list, String letter) {
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i).equals(letter)) {
                list.remove(i);
                i--;
            }
            System.out.println(list);
        }
    }


}
