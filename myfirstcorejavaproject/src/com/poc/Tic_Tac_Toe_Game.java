package com.poc;

import java.util.Scanner;

public class Tic_Tac_Toe_Game {

    static Scanner sc = new Scanner(System.in);

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    // Display the board
    static void boardDisplay() {

        System.out.println("----------------");

        for (int i = 0; i < board.length; i++) {

            System.out.print("| ");

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  | ");
            }

            System.out.println();
            System.out.println("----------------");
        }
    }

    // Take player choice
    static void choices(String playerName, char symbol) {

        int position;
        int row;
        int col;

        while (true) {

            System.out.println("Mr. " + playerName
                    + ", Enter Your Choice From 1 To 9:");

            position = sc.nextInt();

            if (position < 1 || position > 9) {
                System.out.println("Invalid Position! Try Again.");
                continue;
            }

            row = (position - 1) / 3;
            col = (position - 1) % 3;

            if (board[row][col] != ' ') {
                System.out.println("Position Already Occupied! Try Again.");
                continue;
            }

            board[row][col] = symbol;
            break;
        }
    }

    // Check winner
    static boolean checkWinner(char symbol) {

        // Check rows and columns
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }

            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    // Start the game
    static void startGame(String p1, String p2) {

        boolean player1Turn = true;

        for (int i = 1; i <= 9; i++) {

            char symbol;
            String player;

            if (player1Turn) {
                player = p1;
                symbol = 'X';
            } else {
                player = p2;
                symbol = 'O';
            }

            choices(player, symbol);

            boardDisplay();

            if (checkWinner(symbol)) {
                System.out.println("Congratulations " + player
                        + "! You Won The Game.");
                return;
            }

            player1Turn = !player1Turn;
        }

        System.out.println("Game Draw!");
    }

    public static void main(String[] args) {

        System.out.println("****** Welcome To Tic Tac Toe ******");

        boardDisplay();

        System.out.println("Enter Player 1 Name:");
        String p1 = sc.next();

        System.out.println("Enter Player 2 Name:");
        String p2 = sc.next();

        startGame(p1, p2);

        sc.close();
    }
}
//package com.poc;
//
//import java.util.Scanner;
//
//public class Tic_Tac_Toe_Game {
//	
//	static Scanner sc = new Scanner(System.in);
//	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
//
//	static void boardDisplay() {
//
//		System.out.println("----------------");
//		for (int i = 0; i < board.length; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < board[i].length; j++) {
//				System.out.print(board[i][j] + "  | ");
//			}
//			System.out.println();
//			System.out.println("----------------");
//
//		}
//
//	}
//
//	static void coices(String playerName,char symbol) {
//
//		System.out.println("Mr." + playerName + "Please Enter Your Choice From 1 To 9");
//		int position = sc.nextInt();
//		
//		int row = (position-1)/3;
//		int col = (position-1)%3;
//		
//		board[row][col] = symbol;
//
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println("*******Welcome To Tic Tac Toe*******");
//		boardDisplay();
//
//		System.out.println("Enter Player 1 Name : ");
//		String p1 = sc.next();
//		System.out.println("Enter Player 2 Name : ");
//		String p2 = sc.next();
//
//	}
//
//}
