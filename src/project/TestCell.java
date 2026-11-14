package project;
import java.util.Stack;
import java.util.Random;
import java.util.ArrayList;

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
		
		Stack<Cell> stack = new Stack<>();
		
		Random random = new Random();
		
		Cell start = grid [0][0];
		start.visited = true;
		
		stack.push(start);
		
		while(!stack.isEmpty()) {
			
			start = stack.peek();
			
			ArrayList<Cell> neighbours = new ArrayList<>();
			
			int row = start.row;
			int col = start.col;
			
			//checks the cell above
			if(row > 0 && !grid[row - 1][col].visited) {
			
				neighbours.add(grid[row - 1][col]);
			
			}
			
			//checks the cell below
			if(row < M - 1 && !grid[row + 1][col].visited) {
				
				neighbours.add(grid[row + 1][col]);
			
			}
			
			//checks the cell to the left
			if(col > 0 && !grid[row][col - 1].visited) {
				
				neighbours.add(grid[row][col - 1]);
			
			}
			
			//checks the cell to the right
			if(col < N - 1 && !grid[row][col + 1].visited) {
				
				neighbours.add(grid[row][col + 1]);
			
			}
			
			if(!neighbours.isEmpty()) {
				
				Cell next = neighbours.get(random.nextInt(neighbours.size()));
				
				start.removeWall(next);
				
				next.visited = true;
				
				stack.push(next);
				
			}
			
			//this else backtracks
			else {
				
				stack.pop();
				
			}
			
		}
		
	}

}
