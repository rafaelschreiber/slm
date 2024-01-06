package org.cybercitadel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe game;
        Scanner scanner = new Scanner(System.in);
        char playAgain;

        System.out.println("Welcome to CyberCitadel's TicTacToe game. Have fun!");

        do {
            game = new TicTacToe();
            game.start();
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scanner.next().charAt(0);
        } while (Character.toLowerCase(playAgain) == 'y');

        System.out.printf("%nThank you for playing! Developed by:%n");
        System.out.println("  • Nusrat Jahan Meem (ic23b079)");
        System.out.println("  • Rafael Schreiber (ic23b084)");
        System.out.println("  • Mirza Zenkic (ic23b057)");
    }
}
