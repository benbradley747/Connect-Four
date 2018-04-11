//Connect Four game
//Author: Ben Bradley 2018

package game;

import java.util.Scanner;

public class Main {
	
	final static int WIDTH = 6;
	
	final static int HEIGHT = 6;
	
	final static int BOTTOM_ROW = WIDTH - 1;
	
	final static char playerOnePiece = 'X';
	
	final static char playerTwoPiece = 'O';
	
	static char[][] board = new char[WIDTH][HEIGHT];
	
	static int[] numberRow = new int[WIDTH];
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean endCheck = true; //if this is false, the game ends.
		generateBoard();
		System.out.println("Welcome to Connect Four!");
		printNumberRow();
		printBoard();
		
		while(endCheck) {
			//player 1's turn.
			tutorial();
			dropPieceX();
			printNumberRow();
			printBoard();
			if(!checkXHorizontal()) {
				endCheck = false;
				break;
			}
			if(!checkXVertical()) {
				endCheck = false;
				break;
			}
			if(!checkXHorizontalBackward()) {
				endCheck = false;
				break;
			}
			
			//player 2's turn.
			tutorial();
			dropPieceO();
			printNumberRow();
			printBoard();
			if(!checkOHorizontal()) {
				endCheck = false;
				break;
			}
			if(!checkOVertical()) {
				endCheck = false;
				break;
			}
		}
	}
	
	public static void tutorial() {
		System.out.println("Press a number relative to the column you want to place a piece.");
	}
	
	public static void generateBoard() {
		for(int w = 0; w < WIDTH; w++) {
			for(int h = 0; h < HEIGHT; h++) {
				board[w][h] = '.';
			}
		}
	}
	
	public static void printBoard() {
		for(int w = 0; w < WIDTH; w++) {
			for(int h = 0; h < HEIGHT; h++) {
				System.out.print(board[w][h]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printNumberRow() {
		int rowNum = 0;
		for(int w = 0; w < WIDTH; w++) {
			numberRow[w] = rowNum;
			System.out.print(numberRow[w]);
			System.out.print(" ");
			rowNum++;
		}
		System.out.println();
	}
	
	public static void dropPieceX() {
		System.out.println("Player 1's turn:");
		int column = scanner.nextInt();
		int counter = 0;
		
		while(true) {
			if(column > WIDTH) {
				System.out.println("That is not a valid column");
				break;
			}
			
			if(board[BOTTOM_ROW][column] == '.') {
				board[BOTTOM_ROW][column] = 'X';
				break;
			} else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O') {
				if(board[BOTTOM_ROW - counter][column] == '.') {
					board[BOTTOM_ROW - counter][column] = 'X';
					break;
				}
			}
			counter++;
			if(counter == WIDTH) {
				System.out.println("That column is full");
				break;
			}
		}
	}
	
	public static void dropPieceO() {
		System.out.println("Player 2's turn:");
		int column = scanner.nextInt();
		int counter = 0;
		
		while(true) {
			if(column > WIDTH) {
				System.out.println("That is not a valid column");
				break;
			}
			
			if(board[BOTTOM_ROW][column] == '.') {
				board[BOTTOM_ROW][column] = 'O';
				break;
			} else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O') {
				if(board[BOTTOM_ROW - counter][column] == '.') {
					board[BOTTOM_ROW - counter][column] = 'O';
					break;
				}
			}
			counter++;
			if(counter == WIDTH) {
				System.out.println("That column is full");
				break;
			}
		}
	}
	
	public static boolean checkXHorizontal() {
		boolean flag = true;
		int counter = 0;
		
		while(flag) {
			for(int w = 0; w < WIDTH; w++) {
				for(int h = 0; h < HEIGHT; h++) {
					if(board[w][h] == 'X') {
						counter++;
					} else {
						counter = 0;
					}
					
					if(counter >= 4) {
						System.out.println("Player 1 wins!");
						flag = false;
					}
				}
			}
			break;
		}
		
		return flag;
	}
	
	public static boolean checkOHorizontal() {
		boolean flag = true;
		int counter = 0;
		
		while(flag) {
			for(int w = 0; w < WIDTH; w++) {
				for(int h = 0; h < HEIGHT; h++) {
					if(board[w][h] == 'O') {
						counter++;
					} else {
						counter = 0;
					}
					
					if(counter >= 4) {
						System.out.println("Player 2 wins!");
						flag = false;
					}
				}
			}
			break;
		}
		
		return flag;
	}
	
	public static boolean checkXVertical() {
		boolean flag = true;
		int counter = 0;
		
		while(flag) {
			for(int w = 0; w < WIDTH; w++) {
				for(int h = 0; h < HEIGHT; h++) {
					if(board[w][h] == 'X') {
						counter++;
					} else {
						counter = 0;
					}
					
					if(counter >= 4) {
						System.out.println("Player 1 wins!");
						flag = false;
					}
				}
			}
			break;
		}
		
		return flag;
	}
	
	public static boolean checkOVertical() {
		boolean flag = true;
		int counter = 0;
		
		while(flag) {
			for(int w = 0; w < WIDTH; w++) {
				for(int h = 0; h < HEIGHT; h++) {
					if(board[w][h] == 'O') {
						counter++;
					} else {
						counter = 0;
					}
					
					if(counter >= 4) {
						System.out.println("Player 2 wins!");
						flag = false;
					}
				}
			}
			break;
		}
		
		return flag;
	}
	
	public static boolean checkXHorizontalBackward() {
		boolean flag = true;
		int counter = 0;
		
		
		return flag;
	}
	
	public static boolean checkXHorizontalForward() {
		boolean flag = true;
		int counter = 0;
		
		
		return flag;
	}
	
}
