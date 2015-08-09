import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationTest {

    @Test
    public void shouldCallStartGameWhenApplicationStarts() {
        Game game = mock(Game.class);
        Application app = new Application(game);
        app.run();
        verify(game).start();
    }



}