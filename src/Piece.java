
public abstract class Piece {
	private int row;
	private int col;
  private int value;
	private boolean selected;
	private String color;

	public Piece(int row, int col, int val, String color) {
		this.row = row;
		this.col = col;
		this.value = val;
		this.color = color;
    selected = false;
	}
	
  public void select() {
    selected = true;
  }
  public void deselect() {
    selected = false;
  }
  public boolean isSelected() {
    return selected;
  }
	public void move(int r, int c, Board board) {
		row = r;
		col = c;
	}
	
	public void removePiece() {
    row = -1;
    col = -1;
		
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
