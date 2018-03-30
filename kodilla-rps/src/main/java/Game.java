import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game  {
    List<Gesture> humanGesture = new ArrayList<>();
    List<Gesture> computerGesture = new ArrayList<>();

    private static int humanCount;
    private static int computerCount;

    public Game() {
        humanGesture.add(Gesture.ROCK);
        humanGesture.add(Gesture.PAPER);
        humanGesture.add(Gesture.SCISSORS);

        computerGesture.add(Gesture.ROCK);
        computerGesture.add(Gesture.PAPER);
        computerGesture.add(Gesture.SCISSORS);
    }

    public int getUserCount() {
        return humanCount;
    }

    public int getComputerCount() {
        return computerCount;
    }

    public enum Gesture {
        ROCK,
        PAPER,
        SCISSORS;
    }

    public String selectWinner(GameMove gameMove) {
        String winner = GameSolutions.winners.entrySet().stream()
                .filter(e -> e.getKey().getUserMove().equals(gameMove.getUserMove()))
                .filter(e -> e.getKey().getComputerMove().equals(gameMove.getComputerMove()))
                .map(e -> e.getValue())
                .collect(Collectors.joining());
        return winner;
    }
}
