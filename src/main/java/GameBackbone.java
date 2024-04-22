import java.util.ArrayList;

public class GameBackbone {

    private Input input = new Input();
    private ArrayList<String> list = new ArrayList<>();
    String word;

    public ArrayList<String> wordInput() {
        System.out.println("Podaj slowo: ");
        word = input.getInput();
        char[] charTable = word.toCharArray();

        for (char ch : charTable) {
            list.add(Character.toString(ch));
        }
        return list;
    }

    public String letterInput() {
        System.out.println("Podaj literę");
        String leter = input.getInput();
        while (leter.length() > 1) {
            System.out.println("Podaj tylko jedną literę!");
            leter = input.getInput();
        }
        return leter;
    }

    public String getWord() {
        return word;
    }
}
