package project;

public class Cell {

	public boolean visited;
	int row;
	int col;
	public boolean right,left,top,bottom;
	
	public Cell(int r, int c) {
		visited = false;
		row = r;
		col = c;
		right = left = top = bottom = true;
	}
	
	public void removeWall(Cell other) {
		
		if(other.row == row + 1) {
			
			bottom = false;
			other.top = false;
			
		}
		
		else if(other.row == row - 1) {
			
			top = false;
			other.bottom = false;
			
		}
		
		else if(other.col == col + 1) {
			
			right = false;
			other.left = false;
			
		}
		
		else if(other.col == col - 1) {
			
			left = false;
			other.right = false;
			
		}
		
	}
	
	
}
