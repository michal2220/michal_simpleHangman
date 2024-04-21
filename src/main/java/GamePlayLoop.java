import java.util.ArrayList;

public class GamePlayLoop {

    GameBackbone gameBackbone;
    Grapics grapics;
    boolean isAvailable = true;
    int counter = 0;
    ArrayList<String> playerList = new ArrayList<>();
    ArrayList<String> list;
    ArrayList guessedList = new ArrayList<>();

    public GamePlayLoop(GameBackbone gameBackbone, Grapics grapics) {
        this.gameBackbone = gameBackbone;
        this.grapics = grapics;
    }

    private void createPlayerList() {
        for (int i = 0; i < list.size(); i++) {
            playerList.add(i, "_");
        }
    }

    private void showPlayerList() {
        System.out.println(playerList);
    }

    public void gamePlay() {
        list = gameBackbone.wordInput();
        System.out.println("Twoje słowo to: " + gameBackbone.getWord());
        createPlayerList();
        for (int i = 0; i < list.size(); i++) {

            playerList.set(i, list.get(i));
            System.out.println("LISTA" + playerList);


        }
        for (int i = 0; i < playerList.size(); i++) {
            guessedList.add(i, "");

        }
        //showPlayerList();
        while (!list.isEmpty()) {
            String letter = gameBackbone.letterInput();
            checkLetters(list, letter);


            for (int i = 0; i < playerList.size(); i++) {

                if (letter.equals(playerList.get(i))) {
                    guessedList.set(i, letter);
                }

                System.out.println("ODGANIETA LISTA" + guessedList);
            }


            if (!isAvailable) {
                System.out.println("Zła litera");
                counter++;
                grapics.paint(counter);
                if (grapics.looser) {
                    System.out.println("Słowo, którego szukałeś to: " + gameBackbone.getWord());
                    //showPlayerList();
                    break;
                }
            }
            showPlayerList();
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
        //System.out.println("Nowa lista:" + playerList);
        return isAvailable;
    }


}
