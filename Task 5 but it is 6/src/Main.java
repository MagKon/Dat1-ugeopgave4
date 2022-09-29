public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Luigi's café!");
        Cafe cafe = new Cafe();

        //Print from the class
        cafe.showMenu();

        //Print from the main class
        for (String s : cafe.getCoffeeMenu()) {
            System.out.println(s);
        }
    }
}
