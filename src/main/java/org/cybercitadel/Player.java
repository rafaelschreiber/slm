package org.cybercitadel;

public class Player {
    private final char marker;

    public Player(char marker) {
        char uppercase_marker = Character.toUpperCase(marker);
        if (uppercase_marker == 'X' || uppercase_marker == 'O') {
            this.marker = uppercase_marker;
        } else {
            this.marker = ' ';
        }
    }

    public char getMarker() {
        return marker;
    }
}
