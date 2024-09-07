package com.backtracking;

public class Sudoku {

	public static boolean isSafe(char[][] board, int row, int col, int num) {

		// row and col
		for (int j = 0; j < board.length; j++) {
			if (board[row][j] == (char) (num + '0')) {
				return false;
			}
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == (char) (num + '0')) {
				return false;
			}
		}

		// grid

		int startRow = row / 3 * 3;
		int startCol = col / 3 * 3;

		for (int i = 0; i < startRow + 3; i++) {
			for (int j = 0; j < startCol + 3; j++) {
				if (board[i][j] == (char) (num + '0')) {
					return false;
				}
			}
		}

		return true;

	}

	public static boolean helper(char[][] board, int row, int col) {

		int newRow = 0;
		int newCol = 0;

		// basecase
		if (row == board.length) {
			for(int i=0;i<board.length;i++) {
				for(int j=0;j<board.length;j++) {
					System.out.println(board[i][j]);
				}
			}
			return true;
		}

		if (col != board.length - 1) {
			newRow = row;
			newCol = col + 1;
		} else {
			newRow = row + 1;
			newCol = 0;
		}

		if (board[row][col] != '.') {

			if (helper(board, newRow, newCol)) {
				return true;
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isSafe(board, row, col, i)) {
					board[row][col] = (char) (i + '0');
					helper(board, newRow, newRow);

					if (helper(board, newRow, newCol)) {
						return true;
					} else {
						board[row][col] = '.';
					}
				}
			}
		}

		return false;

	}

	public static void solveSudoku(char[][] board) {
		helper(board, 0, 0);
	}

	public static void main(String[] args) {
		char[][] board = new char[9][9];
		solveSudoku(board);
	}
}
