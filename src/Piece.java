//import java.util.*;

public abstract class Piece {
	private int row;
	private int col;
  private int value;
	private boolean selected;
  private boolean hasMoved;
	private String color;

	public Piece(int row, int col, int val, String color) {
		this.row = row;
		this.col = col;
		this.value = val;
		this.color = color;
    this.selected = false;
    this.hasMoved = false;
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
  public abstract boolean isLegal(int r, int c);
  
	public boolean move(int r, int c, Board board) {
    if (isLegal(r,c))
    {
		  row = r;
		  col = c;
      if (!hasMoved) hasMoved = true;
      return true;
    }
    return false;
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
  public void setCords(int r, int c)
  {
    row = r;
    col = c;
    hasMoved = true;
  }
	
	public String getColor() {
		return color;
	}
	
	
}
