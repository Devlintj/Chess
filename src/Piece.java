
public class Piece {
	private int row;
	private int col;
	private String color;
	Piece(int row, int col, String color) {
		this.row = row;
		this.col = col;
		this.color = color;
	}
	
	public void move(int r, int c, Board board) {
		row = r;
		col = c;
	}
	
	public void removePiece() {
		
	}
	
	public void draw() {
		
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
