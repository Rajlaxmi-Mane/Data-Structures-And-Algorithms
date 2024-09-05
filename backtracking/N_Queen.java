package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class N_Queen {

	public static void saveBoard(char[][] board,List<List<String>> allBoards) {
		String row="";
		List<String> newBoard=new ArrayList<>();
		for(int i=0;i<board.length;i++) {
			row="";
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]=='Q') {
					row+='Q';
				}else {
					row+='.';
				}
			}
			newBoard.add(row);
			
		}
		allBoards.add(newBoard);
	}
	public static boolean isSafe(int row, int col, char[][] board) {
		for (int j = 0; j < board.length; j++) {
			if (board[row][j] == 'Q') {
				return false;
			}
		}

		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}

		int r = row;
		for (int c = col; c >= 0 && r >= 0; c--, r--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		r=row;
		for(int c=col;c<board.length && r>=0; r--,c++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		
		r=row;
		for(int c=col;c>=0 && r<board.length; r++,c--) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		
		r=row;
		for(int c=col;c<board.length && r<board.length; r++,c++) {
			if (board[r][c] == 'Q') {
				return false;
			}
		}
		return true;

	}

	public static void helper(char[][] board, List<List<String>> allBoards, int col) {
		
		// it is a recursive method . it will decide on which position queen should be placed
		if (col == board.length) {
			saveBoard(board, allBoards);
		}

		for (int row = 0; row < board.length; row++) {
			if (isSafe(row, col, board)) {
				board[row][col] = 'Q';
				helper(board, allBoards, col + 1);
				board[row][col] = '.';
			}
		}
	}

	public static List<List<String>> placeQueens(int n) {
		
		//in allBoards we will have our solutions
		List<List<String>> allBoards = new ArrayList<>();
		
		//N*N chess boards
		char[][] board = new char[n][n];
		
		// helper() will decide on which position queen should be placed
		helper(board, allBoards, 0);
		return allBoards;
	}

	public static void main(String[] args) {
		int n=6;
		
		// plaeQueens method will return List of List which will have solution for n-Queen problem
		
		List<List<String>> allBoards=new ArrayList<>();
		allBoards=placeQueens(n);
		
		// to print all solution in different line
		for(List<String> obj:allBoards) {
			System.out.println(obj);
		}
//      System.out.println(placeQueens(n));  if we print like this result will come in same line
	}

}
