import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Game  {
    List<Gesture> computerGesture = new ArrayList<>();

    private static int humanCount;
    private static int computerCount;

    public Game() {
        computerGesture.add(Gesture.ROCK);
        computerGesture.add(Gesture.PAPER);
        computerGesture.add(Gesture.SCISSORS);
    }
    public static void zeroCount() {
        humanCount = 0;
        computerCount = 0;
    }

    public static int getUserCount() {
        return humanCount;
    }

    public static int getComputerCount() {
        return computerCount;
    }

    public enum Gesture {
        ROCK,
        PAPER,
        SCISSORS;
    }

    public static String selectWinner(GameMove gameMove) {
        String winner = GameSolutions.winners.entrySet().stream()
                .filter(e -> e.getKey().getUserMove().equals(gameMove.getUserMove()))
                .filter(e -> e.getKey().getComputerMove().equals(gameMove.getComputerMove()))
                .map(e -> e.getValue())
                .collect(Collectors.joining());
        return winner;
    }

    public static void addPoints(GameMove gameMove){
        String winner = selectWinner(gameMove);
        if(winner.equals(GameSolutions.HUMAN))
        {
            humanCount++;
        } else if(winner.equals(GameSolutions.COMPUTER)) {
            computerCount++;
        }
    }
    public Game.Gesture computerMove() {
        Random random = new Random();
        int gestureNumber = random.nextInt(3);
        return computerGesture.get(gestureNumber);
    }
    public static boolean endGame() {
        if(humanCount == UserDialogs.getQuantity() || computerCount == UserDialogs.getQuantity()){
            return true;
        }
        return false;
    }

    public static void endGame(String question) {
        Scanner in = new Scanner(System.in);
        boolean endGame = true;
        while (endGame) {
            System.out.println(question);
            String choose;
            choose = in.nextLine();
            if (choose.equals("Y") || choose.equals("y")) {
                System.exit(0);
            } else if (choose.equals("N") || choose.equals("n")) {
                endGame = false;
            } else {
                System.out.println("Invalid characters, please use only Y or N!");
            }
        }
    }

    public static void newGame(String question) {
        Scanner in = new Scanner(System.in);
        boolean endGame = true;
        while (endGame) {
            System.out.println(question);
            String choose;
            choose = in.nextLine();
            if (choose.equals("Y") || choose.equals("y")) {
                zeroCount();
                PlayGame.playGame();
            } else if (choose.equals("N") || choose.equals("n")) {
                endGame = false;
            } else {
                System.out.println("Invalid characters, please use only Y or N!");
            }
        }
    }
}
