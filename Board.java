/**
 * Battleship class
 * Tim Robertson
 **/

public class Board {
	private enum Cell {EMPTY, OCCUPIED, HIT, MISS}
	private Cell[][] board;
	public Board() {
		board = new Cell[10][10];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = Cell.EMPTY;
			}
		}
	}
	public char getCell(int x, int y) {
		switch(board[y][x]) {
			case EMPTY:
				return '_';
			case OCCUPIED:
				return '#';
			case HIT:
				return 'X';
			case MISS:
				return '/';
			default:
				return '?';
		}
	}
	public void placePiece(int x, int y, int length, boolean isVertical) {
		boolean clear = true;
		if(isVertical) {
			for(int i = y; i < y + length; i++) {
				clear = !(board[y][i] == Cell.OCCUPIED);
			}
		}
		else {
			for(int i = x; i < x + length; i++) {
				clear = !(board[i][x] == Cell.OCCUPIED);
			}
		}
		if((x + length < board[0].length || y + length < board.length) && (clear)) {
			if(isVertical) {
				for(int i = y; i < y + length; i++) {
					board[y][i] = Cell.OCCUPIED;
				}
			}
			else {
				for(int i = x; i < x + length; i++) {
					board[i][x] = Cell.OCCUPIED;
				}
			}
		}
		else
			System.err.println("Out of bounds");
			
	}
					
					
	public boolean makeAttack(int x, int y) {
		if (board[y][x] == Cell.EMPTY) {
			board[y][x] = Cell.MISS;
			return false;
		}
		else if(board[y][x] == Cell.OCCUPIED) {
			board[y][x] = Cell.HIT;
			return true;
		}
		return false;
	}
	
	public void print() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print("[" + getCell(i, j) + "]");
			}
			System.out.println();
		}
	}
}
