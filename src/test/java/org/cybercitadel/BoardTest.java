package org.cybercitadel;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void Test_isCellEmpty() {
        Board board = new Board();
        board.place(1, 1, 'X');
        assertFalse(board.isCellEmpty(1, 1));
        assertTrue(board.isCellEmpty(2, 2));
        assertFalse(board.isCellEmpty(3, 3));
    }

    @Test
    public void Test_place() {
        Board board = new Board();

        // normal place within board
        board.place(2, 1, 'X');
        assertEquals(Character.toString('X'), board.getCell(2, 1));
        board.place(2, 2, 'o');
        assertEquals(Character.toString('O'), board.getCell(2, 2));

        // place out of board range
        board.place(3, 0, 'X');
        assertEquals(Character.toString(' '), board.getCell(3, 0));

        // place invalid marker
        board.place(1, 2, 'N');
        assertEquals(Character.toString(' '), board.getCell(1, 2));
    }
    public void Test_isFull() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');
        board.place(1, 0, 'X');
        board.place(1, 1, 'X');
        board.place(1, 2, 'X');
        board.place(2, 0, 'X');
        board.place(2, 1, 'X');
        board.place(2, 2, 'N');
        assertFalse(board.isFull());
        board.place(2, 2, 'o');
        assertTrue(board.isFull());
    }
}
