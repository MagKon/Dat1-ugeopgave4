import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<String> options;

    public Menu(ArrayList<String> options_) {
        options = new ArrayList<>();
        this.options = options_;
    }

    public int showMenu () {
        int choice = 0;
        System.out.println("Type a number to choose: ");
        for (String s : options) {
            System.out.println(options.indexOf(s)+1 + ". " + s);
        }
        Scanner scanner = new Scanner(System.in);

        try {
            choice = scanner.nextInt();
            System.out.println("You chose: " + options.get(choice-1));
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        return choice;
    }
}
