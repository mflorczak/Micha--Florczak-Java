import java.awt.dnd.DragGestureEvent;
import java.util.HashMap;
import java.util.Map;

public class GameSolutions {
    public static final String HUMAN ="HUMAN";
    public static final String COMPUTER = "COMPUTER";
    public static final String DRAW = "DRAW";

    public static final Map<GameMove, String> winners = new HashMap<>();
        static {
            winners.put(new GameMove(Game.Gesture.ROCK, Game.Gesture.PAPER), COMPUTER);
            winners.put(new GameMove(Game.Gesture.PAPER, Game.Gesture.ROCK), HUMAN);
            winners.put(new GameMove(Game.Gesture.ROCK, Game.Gesture.ROCK), DRAW);
            winners.put(new GameMove(Game.Gesture.PAPER, Game.Gesture.PAPER), DRAW);
            winners.put(new GameMove(Game.Gesture.SCISSORS, Game.Gesture.SCISSORS), DRAW);
            winners.put(new GameMove(Game.Gesture.SCISSORS, Game.Gesture.PAPER), HUMAN);
            winners.put(new GameMove(Game.Gesture.PAPER, Game.Gesture.SCISSORS), COMPUTER);
            winners.put(new GameMove(Game.Gesture.ROCK, Game.Gesture.SCISSORS), HUMAN);
            winners.put(new GameMove(Game.Gesture.SCISSORS, Game.Gesture.ROCK), COMPUTER);
        }
}
