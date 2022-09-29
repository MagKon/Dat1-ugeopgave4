import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
        loadMenuData();
    }

    public void loadMenuData() {
        File file = new File("src/coffees.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showMenu() {
        System.out.println("Coffee menu:");
        for (String s : coffeeMenu) {
            System.out.println(s);
        }
    }
}
