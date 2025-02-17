package com.wipro.java.usecase;

import java.util.Scanner;

public class TicTacToe {
	public static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	public static char currentPlayer = 'X';
	public static boolean gameWon = false;
	public static boolean gameOver = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (!gameOver) {
			printBoard();
			playerMove(scanner);
			gameWon = checkWinner();
			if (gameWon) {
				printBoard();
				System.out.println("Player " + currentPlayer + " wins!");
				gameOver = true;
			} else if (isBoardFull()) {
				printBoard();
				System.out.println("It's a draw!");
				gameOver = true;
			} else {
				switchPlayer();
			}
		}
		scanner.close();
	}

	public static void printBoard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println("\n-------------");
		}
	}

	public static void playerMove(Scanner scanner) {
		int row, col;
		while (true) {
			System.out.println("Player " + currentPlayer + ", enter row (1-3) and column (1-3): ");
			row = scanner.nextInt() - 1;
			col = scanner.nextInt() - 1;
			if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
				board[row][col] = currentPlayer;
				break;
			} else {
				System.out.println("Invalid move, try again.");
			}
		}
	}

	public static boolean checkWinner() {
		// Check rows, columns and diagonals
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
				return true;
			if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
				return true;
		}
		if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
			return true;
		if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
			return true;

		return false;
	}

	public static boolean isBoardFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static void switchPlayer() {
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}
}
