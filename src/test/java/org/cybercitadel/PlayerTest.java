package org.cybercitadel;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void Test_getMarker() {
        Player player1 = new Player('X');
        assertEquals('X', player1.getMarker());

        // check for case insensitivity
        Player player2 = new Player('o');
        assertEquals('O', player2.getMarker());

        Player player3 = new Player('1');
        assertEquals(' ', player3.getMarker());
    }
}
