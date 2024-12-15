 package Day02;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3]; // 3x3 board
    private static char currentPlayer = 'X'; // Current player ('X' or 'O')

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    // Initialize the board with empty spaces
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Main game loop
    public static void playGame() {
        boolean gameOn = true;
        Scanner scanner = new Scanner(System.in);

        while (gameOn) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");

            int row, col;
            while (true) {
                System.out.print("Row (0, 1, 2): ");
                row = scanner.nextInt();
                System.out.print("Column (0, 1, 2): ");
                col = scanner.nextInt();

                if (isValidMove(row, col)) {
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }

            board[row][col] = currentPlayer; // Place the player's mark

            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOn = false;
            } else if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOn = false;
            } else {
                switchPlayer(); // Switch to the other player
            }
        }

        scanner.close();
    }

    // Print the game board
    public static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    // Check if a move is valid
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Switch the current player
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check for a win condition
    public static boolean checkWin() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) || // Row
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) { // Column
                return true;
            }
        }
        // Diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    // Check for a draw condition
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Empty space found, not a draw
                }
            }
        }
        return true; // No empty spaces, it's a draw
    }
}
