import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RpsTestSuite {
    @Test
    public void testSelectWinner() {
        //Given
        GameMove gameMove = new GameMove(Game.Gesture.SCISSORS, Game.Gesture.ROCK);
        Game game = new Game();

        //When
        String result1 = game.selectWiner(gameMove);
        String result2 = game.selectWiner(new GameMove(Game.Gesture.SCISSORS, Game.Gesture.SCISSORS));
        String result3 = game.selectWiner(new GameMove(Game.Gesture.ROCK, Game.Gesture.SCISSORS));
        String result4 = game.selectWiner(new GameMove(Game.Gesture.ROCK, Game.Gesture.PAPER));
        String result5 = game.selectWiner(new GameMove(Game.Gesture.PAPER, Game.Gesture.ROCK));
        String result6 = game.selectWiner(new GameMove(Game.Gesture.ROCK, Game.Gesture.ROCK));
        String result7 = game.selectWiner(new GameMove(Game.Gesture.PAPER, Game.Gesture.PAPER));
        String result8 = game.selectWiner(new GameMove(Game.Gesture.PAPER, Game.Gesture.SCISSORS));
        String result9 = game.selectWiner(new GameMove(Game.Gesture.SCISSORS, Game.Gesture.PAPER));

        //Then
        Assert.assertEquals("COMPUTER",result1);
        Assert.assertEquals("DRAW",result2);
        Assert.assertEquals("HUMAN",result3);

        Assert.assertEquals("COMPUTER",result4);
        Assert.assertEquals("HUMAN",result5);
        Assert.assertEquals("DRAW",result6);

        Assert.assertEquals("DRAW",result7);
        Assert.assertEquals("COMPUTER",result8);
        Assert.assertEquals("HUMAN",result9);

    }

}
