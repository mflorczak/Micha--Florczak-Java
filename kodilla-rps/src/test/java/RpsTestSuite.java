import org.junit.Assert;
import org.junit.Test;

public class RpsTestSuite {
    @Test
    public void testGetMoveUser() {
        //Given
        Game game = new Game();

        //When
        String name = game.getMoveUser(1);

        //Then
        Assert.assertEquals(3,game.userGesture.size());
        Assert.assertEquals("Paper",name);
    }

    @Test
    public void testGetMoveComputer() {
        //Given
        Game game = new Game();

        //When
        String name = game.getMoveComputer(1);

        //Then
        Assert.assertEquals(3,game.computerGesture.size());
        Assert.assertEquals("Paper",name);
    }

    @Test
    public void testGame() {
        //Given
        Game game = new Game();

        //When
        game.game(1,2);
        game.game(2,0);
        game.game(1,1);

        //Then
        int scoreUser = game.getUserCount();
        int scoreComputer = game.getComputerCount();
        Assert.assertEquals(0,scoreUser);
        Assert.assertEquals(2,scoreComputer);
    }
}
