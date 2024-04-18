import java.util.Scanner;

public class Input {

    public String getInput() {
        System.out.println("Podaj slowo: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    }

}
