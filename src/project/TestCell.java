package project;

public class TestCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//These variables change the size of the grid like shown in lecture video
		int M = 10;
		int N = 10;
		Cell [][] grid = new Cell[M][N];
		//loops over rows
		for(int i = 0; i < grid.length; i++) {
			
			//loops over columns
			for(int j = 0; j < grid[0].length; j++) {
				
				grid[i][j] = new Cell(i,j);
				
			}
		}
		
	}

}
