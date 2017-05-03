
public class Piece {
	private int[][] pos;
	private String color;
	Piece(int[][] pos, String color) {
		this.pos = pos;
		this.color = color;
	}
	
	public void move(int[][] destination) {
		pos = destination;
	}
	
	public void removePiece() {
		
	}
	
	public void draw() {
		
	}
	
	public int[][] getPos() {
		return pos;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
