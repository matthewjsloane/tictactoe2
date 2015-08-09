import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    public void shouldCallDrawBoardWhenGameStarts() {
        Board board = mock(Board.class);
        Game game = new Game(board);
        game.start();
        verify(board).draw();

    }



}