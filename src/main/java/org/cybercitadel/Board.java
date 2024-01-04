package org.cybercitadel;

public class Board {
    private final char[][] cells;

    public Board() {
        cells = new char[3][3];
        clear();
    }

    public void clear() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                cells[x][y] = ' ';
            }
        }
    }

    public boolean isCellEmpty(int x, int y) {
        if ((x >= 0 && x <=2) && (y >= 0 && y <= 2)) {
            return cells[x][y] == ' ';
        } else {
            return false;
        }
    }

    public void place(int x, int y, char marker) {
        char uppercase_marker = Character.toUpperCase(marker);
        if ((x >= 0 && x <=2) && (y >= 0 && y <= 2) && (uppercase_marker == 'X' || uppercase_marker == 'O')) {
            cells[x][y] = uppercase_marker;
        }
    }

    public String getCell(int x, int y) {
        if ((x >= 0 && x <=2) && (y >= 0 && y <= 2)) {
            return Character.toString(cells[x][y]);
        } else {
            return Character.toString(' ');
        }
    }
}
