
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        String name;
        int quantity;

        Scanner in = new Scanner(System.in);
        System.out.print("Give your name:");
        name = in.next();
        System.out.println("How many rounds you want to play?");
        quantity = in.nextInt();
        System.out.println("Welcome " + name);

        while (!end){
            Game game = new Game();
            System.out.println("Button 1 - Play \"Rock\"\n" +
                    "Button 2 - Play \"Paper\"\n" +
                    "Button 3 - Play \"Scissors\"\n" +
                    "Button x - Close game\n" +
                    "Button n - New game\n");
            String move;
            if(game.getUserCount() == quantity || game.getComputerCount() == quantity) {
                if(game.getComputerCount() > game.getUserCount()) {
                    System.out.println("Computer WON Result = " + game.getComputerCount() + ":" + game.getUserCount());
                } else {
                    System.out.println("User: " + name + " WON Result = " + game.getUserCount() + ":" + game.getComputerCount());
                }
                System.out.println("Button x - Close game\n" +
                        "Button n - New game\n");
                move = in.next();
            } else {
                move = in.next();
            }
            switch (move)
            {
                case "1":
                    Random random = new Random();
                    int moveComputer = random.nextInt(3);
                    game.game(0,moveComputer);
                    break;

                case "2":
                    random = new Random();
                    moveComputer = random.nextInt(3);
                    game.game(1,moveComputer);
                    break;

                case "3":
                    random = new Random();
                    moveComputer = random.nextInt(3);
                    game.game(2,moveComputer);
                    break;

                case "x":
                    System.out.println("Are you sure want to close game? T/N");
                    String close = in.next();
                    if(close.equals("T") || close.equals("t")) {
                        System.exit(0);
                        end = true;
                    }
                    break;

                case "n":
                    System.out.println("Are you sure want to start new game? T/N");
                    String newGame = in.next();
                    if(newGame.equals("T") || newGame.equals("t")) {
                        System.out.print("Give your name:");
                        name = in.next();
                        System.out.println("How many rounds you want to play?");
                        quantity = in.nextInt();
                        System.out.println("Welcome " + name);
                        game = new Game(0,0);
                    }
                    break;

                    default:
                        System.out.println("Wrong button!");
                        break;
            }
        }
    }
}
