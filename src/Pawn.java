
public class Pawn extends Piece {
	private boolean hasMoved = false;
	public Pawn(int r, int c, String color) {
		super(r, c, color);
	}
	
	public void move(int[][] destination, Board board) {
		if(board.getTile(getRow() - 1, getCol()) != null) {
			
		}
	}

}
