public class GameMove {
    private Game.Gesture userMove;
    private Game.Gesture computerMove;

    public GameMove(Game.Gesture userMove, Game.Gesture computerMove) {
        this.userMove = userMove;
        this.computerMove = computerMove;
    }

    public Game.Gesture getUserMove() {
        return userMove;
    }

    public Game.Gesture getComputerMove() {
        return computerMove;
    }
}
