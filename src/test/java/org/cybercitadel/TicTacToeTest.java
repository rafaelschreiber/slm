package org.cybercitadel;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void Test_switchCurrentPlayer() {
        TicTacToe game = new TicTacToe();
        assertEquals('X', game.getCurrentPlayer().getMarker());
        game.switchCurrentPlayer();
        assertEquals('O', game.getCurrentPlayer().getMarker());
        game.switchCurrentPlayer();
        assertEquals('X', game.getCurrentPlayer().getMarker());
    }
}
