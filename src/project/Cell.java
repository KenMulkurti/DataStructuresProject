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
	
	
	
}
