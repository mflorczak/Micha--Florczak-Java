public class Menu {
    public static void showMenu() {
        System.out.println("Button 1 - Play \"Rock\"\n" +
                "Button 2 - Play \"Paper\"\n" +
                "Button 3 - Play \"Scissors\"\n" +
                "Button x - Close game\n" +
                "Button n - New game\n");
    }

    public static void welcomeHuman() {
        System.out.println("Welcome " + UserDialogs.getUserName());
    }
}
