import java.util.ArrayList;

public class PrepareGame {

    private Input input = new Input();
    private ArrayList<Character> list = new ArrayList<>();
    private char[] charTable;
    public void prepareGame() {
        String word = input.getInput();
        charTable = word.toCharArray();

        for (char ch : charTable) {
            list.add(ch);
        }
    }

    public ArrayList<Character> getList() {
        return list;
    }

}
