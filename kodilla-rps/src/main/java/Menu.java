import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        System.out.println("Button 1 - Play \"Rock\"\n" +
                "Button 2 - Play \"Paper\"\n" +
                "Button 3 - Play \"Scissors\"\n" +
                "Button x - Close game\n" +
                "Button n - New game\n" +
                "Choose your move: ");
    }

    public static void whenUserWon() {
        System.out.println("Button x - Close game\n" +
                "Button n - New game\n" +
                "Choose your move: ");
        String choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextLine().toLowerCase();


        switch (choose) {
            case "x":
                System.exit(0);
                break;
            case "n":
                Game.zeroCount();
                PlayGame.playGame();
                break;
            default:
                System.out.println("Wrong move!");
                break;
        }
    }

    public static void showResult() {
        System.out.println("Human points: " + Game.getUserCount() + "\n" +
                "Computer points: " + Game.getComputerCount()+ "\n");
    }

    public static void welcomeHuman() {
        UserDialogs userDialogs = new UserDialogs();
        System.out.println("Welcome " + userDialogs.getName() +
                ". You play to " + userDialogs.getQuantity() + " wins");
    }

    public static String whoWon() {
        if(Game.getComputerCount() < Game.getUserCount()) {
            return UserDialogs.getName() + " won!";
        } else {
            return GameSolutions.COMPUTER + " won!";
        }
    }

    public static void decoration(){
        for (int i = 0; i <= whoWon().length() + 1; i++) {
                System.out.print("*");
        }
        System.out.println("\n*" + whoWon() + "*");
        for (int i = 0; i <= whoWon().length() + 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void validator(GameMove gameMove) {
        if(Game.selectWinner(gameMove).equals(GameSolutions.DRAW)) {
            System.out.println(GameSolutions.DRAW);
        } else {
            System.out.println("Won: " + Game.selectWinner(gameMove));
        }
    }

}
