import java.util.ArrayList;
import java.util.List;

public class Game  {
    List<Gesture> computerGesture = new ArrayList<>();
    List<Gesture> userGesture = new ArrayList<>();
    private static int userCount;
    private static int computerCount;

    public Game() {
        computerGesture.add(new Rock());
        computerGesture.add(new Paper());
        computerGesture.add(new Scissors());
        userGesture.add(new Rock());
        userGesture.add(new Paper());
        userGesture.add(new Scissors());
    }

    public Game(int userCount, int computerCount) {
        computerGesture.add(new Rock());
        computerGesture.add(new Paper());
        computerGesture.add(new Scissors());
        userGesture.add(new Rock());
        userGesture.add(new Paper());
        userGesture.add(new Scissors());
        this.userCount = 0;
        this.computerCount = 0;
    }

    public String getMoveUser(int n){
        return userGesture.get(n).getName();
    }

    public String getMoveComputer(int n){
        return userGesture.get(n).getName();
    }

    public int getUserCount() {
        return userCount;
    }

    public int getComputerCount() {
        return computerCount;
    }

    public void game(int userMove, int computerMove)
    {
        if(getMoveUser(userMove).equals("Rock") && getMoveComputer(computerMove).equals("Paper")) {
            computerCount++;
            System.out.println("Computer WIN! Result = " + getComputerCount() + ":" + getUserCount());
        }
        if(getMoveUser(userMove).equals("Paper") && getMoveComputer(computerMove).equals("Rock")) {
            userCount++;
            System.out.println("User WIN! Result = " + getUserCount() + ":" + getComputerCount());
        }
        if(getMoveUser(userMove).equals("Rock") && getMoveComputer(computerMove).equals("Scissors")) {
            userCount++;
            System.out.println("User WIN! Result = " + getUserCount() + ":" + getComputerCount());
        }
        if(getMoveUser(userMove).equals("Scissors") && getMoveComputer(computerMove).equals("Rock")) {
            computerCount++;
            System.out.println("Computer WIN! Result = " + getComputerCount() + ":" + getUserCount());
        }
        if(getMoveUser(userMove).equals("Scissors") && getMoveComputer(computerMove).equals("Paper")) {
            userCount++;
            System.out.println("User WIN! Result = " + getUserCount() + ":" + getComputerCount());
        }
        if(getMoveUser(userMove).equals("Paper") && getMoveComputer(computerMove).equals("Scissors")) {
            computerCount++;
            System.out.println("Computer WIN! Result = " + getComputerCount() + ":" + getUserCount());
        }
        if (getMoveUser(userMove).equals(getMoveComputer(computerMove))) {
            System.out.println("Draw (User)" + getUserCount() + ":" + getComputerCount() + "(Computer)");
        }
    }
}
