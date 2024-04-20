import java.util.Scanner;

public class Input {

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

}
