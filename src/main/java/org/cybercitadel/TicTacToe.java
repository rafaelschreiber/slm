package org.cybercitadel;

import java.util.Scanner;

public class TicTacToe {
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;
    private final Board board;


    public TicTacToe() {
        board = new Board();
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean isGameActive = true; // indicator if game is running
        int row = 0;
        int col = 0;
        int inp; // user input buffer
        String setBy = "N"; // stores player who already set the cell

        // game loop
        while (isGameActive) {
            System.out.printf("%nCurrent Player: %C%n", currentPlayer.getMarker());
            board.print();

            // input loop
            while (true) {
                // ask for row and column
                for (String axis : new String[]{"row", "column"}) {
                    while (true) {
                        System.out.printf("Enter %s (0-2): ", axis);
                        if (!scanner.hasNextInt()) {
                            System.out.printf("Invalid input. Please enter a valid number for the %s.%n", axis);
                            scanner.nextLine(); // Clear the input buffer
                            continue;
                        }
                        inp = scanner.nextInt();
                        if (inp < 0 || inp > 2) {
                            System.out.printf("Invalid input. Input '%d' for %s must be between 0 and 2.%n", inp, axis);
                            continue;
                        }
                        if (axis.equals("row")) {
                            row = inp;
                        } else {
                            col = inp;
                        }
                        break;
                    }
                }

                // check if cell is not occupied
                if (!board.isCellEmpty(row, col)) {
                    setBy = board.getCell(row, col);
                    System.out.printf("Invalid input. Cell (%d|%d) is already set by player %s.%n", row, col, setBy);
                    continue;
                }
                board.place(row, col, currentPlayer.getMarker());
                break;
            }
            switchCurrentPlayer();
        }
    }

    public void switchCurrentPlayer() {
        if (currentPlayer.getMarker() == 'X') {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    protected Player getCurrentPlayer() {
        return currentPlayer;
    }
}
