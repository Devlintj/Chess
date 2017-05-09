
public class Pawn extends Piece {

	public Pawn(int r, int c, String color) {
		super(r, c, 1, color);
	}
	
	public void move(int[][] destination, Board board) {
		if(board.getTile(getRow() - 1, getCol()) != null) {
			
		}
	}

  @Override
  public boolean isLegal(int r, int c)
  {
    return c > 0 && r == 0 && 
    ((!hasMoved&&c<=2)||(hasMoved&&c==1));
  }

}
