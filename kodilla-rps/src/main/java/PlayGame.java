import java.util.Scanner;

public class PlayGame {
    public static void playGame() {
        Game game = new Game();
        Menu.welcomeHuman();
        boolean end = false;

        while(!end) {
            Menu.showMenu();
            String move;
            Scanner in = new Scanner(System.in);
            move = in.nextLine().toLowerCase();

            switch (move) {
                case "1":
                    GameMove gameMove = new GameMove(Game.Gesture.ROCK, game.computerMove());
                    Game.addPoints(gameMove);
                    if(Game.selectWinner(gameMove).equals(GameSolutions.DRAW)) {
                        System.out.println(GameSolutions.DRAW);
                    } else {
                        System.out.println("Won: " + Game.selectWinner(gameMove));
                    }
                    break;
                case "2":
                    gameMove = new GameMove(Game.Gesture.PAPER, game.computerMove());
                    Game.addPoints(gameMove);
                    if(Game.selectWinner(gameMove).equals(GameSolutions.DRAW)) {
                        System.out.println(GameSolutions.DRAW);
                    } else {
                        System.out.println("Won: " + Game.selectWinner(gameMove));
                    }
                    break;
                case "3":
                    gameMove = new GameMove(Game.Gesture.SCISSORS, game.computerMove());
                    Game.addPoints(gameMove);
                    if(Game.selectWinner(gameMove).equals(GameSolutions.DRAW)) {
                        System.out.println(GameSolutions.DRAW);
                    } else {
                        System.out.println("Won: " + Game.selectWinner(gameMove));
                    }
                    break;
                case "x":
                   Game.endGame("Close game?(T/N)");
                    break;
                case "n":
                    Game.newGame("New game?(T/N)");
                    break;
                default:
                    System.out.println("Wrong move!");
                    break;
                }
                Menu.showResult();
                end =Game.endGame();
            }
            Menu.decoration();
            Menu.whenUserWon();
    }
}

