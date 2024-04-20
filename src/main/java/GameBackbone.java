import java.util.ArrayList;

public class GameBackbone {

    private Input input = new Input();
    private ArrayList<String> list = new ArrayList<>();
    private char[] charTable;
    String word;
    public ArrayList wordInput() {
        System.out.println("Podaj slowo: ");
        word = input.getInput();
        charTable = word.toCharArray();

        for (char ch : charTable) {
            list.add(Character.toString(ch));
        }
        return list;
    }

    public String letterInput() {
        System.out.println("Podaj literę");
        String leter = input.getInput();
        while (leter.length()>1) {
            System.out.println("Podaj tylko jedną literę!");
            leter = input.getInput();
        }
        return leter;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public String getWord() {
        return word;
    }
}