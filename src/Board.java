
public class Board {
	private Tile[][] pos;
	private Piece[][] cord;
	public Board() {
		pos = new Tile[8][8];
		cord = new Piece[8][8];
		newGame();
		/** implement tile setup */
	}
	
	public Board(Board a) {
		
	}
	
	private void newGame() {
		Piece[][] setup = new Piece[8][8];
		/** implement code */
		cord = setup;
	}
	
	public void removePiece() {
		
	}
	
	public Piece getTile(int r, int c) {
		return cord[r][c];
	}
}
