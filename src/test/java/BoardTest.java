import org.junit.Test;

import java.io.BufferedReader;

import static org.mockito.Mockito.mock;

public class BoardTest {

    @Test
    public void shouldDrawBoardWhenDrawIsCalled() {
        BufferedReader reader = mock(BufferedReader.class);
        Board board = new Board(reader);

    }



}