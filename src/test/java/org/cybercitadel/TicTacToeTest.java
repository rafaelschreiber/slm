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
    public void Test_hasWinner() {
        TicTacToe game = new TicTacToe();
        game.getBoard().place(0, 0, 'X');
        game.getBoard().place(1, 1, 'X');
        game.getBoard().place(2, 2, 'X');
        assertEquals('X', game.hasWinner());
        game.getBoard().clear();
        game.getBoard().place(1, 0, 'o');
        game.getBoard().place(1, 1, 'O');
        game.getBoard().place(1, 2, 'o');
        assertEquals('O', game.hasWinner());
        game.getBoard().clear();
        game.getBoard().place(0, 0, 'x');
        game.getBoard().place(0, 1, 'o');
        game.getBoard().place(0, 2, 'x');
        game.getBoard().place(1, 0, 'x');
        game.getBoard().place(1, 1, 'o');
        game.getBoard().place(1, 2, 'x');
        game.getBoard().place(2, 0, 'o');
        game.getBoard().place(2, 1, 'x');
        game.getBoard().place(2, 2, 'o');
        assertEquals('D', game.hasWinner());
    }
}
