/**
 * Battleship class
 * Tim Robertson
 **/

public class Battleship {
	public static void main(String[] args) {
		Board b = new Board();
		b.print();
		System.out.println();
		b.makeAttack(1, 1);
		b.print();
		System.out.println();
		b.placePiece(4, 5, 5, true);
		b.print();
		System.out.println();
		b.makeAttack(5, 5);
		b.print();
		System.out.println();
		b.placePiece(1, 1, 4, false);
		b.print();
		System.out.println();
	}

}
