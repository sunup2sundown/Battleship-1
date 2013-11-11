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
				break;
			case OCCUPIED:
				return '#';
				break;
			case HIT:
				return 'X';
				break;
			case MISS:
				return '/';
			default:
				return '?';
		}
	}
}
