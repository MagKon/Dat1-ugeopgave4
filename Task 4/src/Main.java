import java.util.ArrayList;

public class Main {
    public static ArrayList<String> actions = new ArrayList<>();

    public static void main(String[] args) {
        actions.add("Start game");
        actions.add("Resume game");
        actions.add("Pause game");
        actions.add("End game");

        Menu menu = new Menu(actions);
        int state = menu.showMenu();
        doAction(state);
    }

    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
