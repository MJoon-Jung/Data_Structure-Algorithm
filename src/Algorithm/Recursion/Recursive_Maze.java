package Algorithm.Recursion;

public class Recursive_Maze {
	private static int N = 8;
	private static int [][] maze = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
	};
	private static final int PATHWAY_COLOUR = 0;
	private static final int WALL_COLOUR = 1;
	private static final int BLOCKED_COLOUR = 2;
	private static final int PATH_COLOUR = 3;
	
	public static void main(String[] args) {
		printMaze(N, maze);
		System.out.println();
		findmazePath(0,0);
		printMaze(N, maze);
		
	}
	public static void printMaze(int n, int[][]maze){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(maze[i][j]);
			}
			System.out.println("");
		}
	 }
	public static boolean findmazePath(int x, int y) {
		if(x < 0 || y < 0 || x >= N || y >= N) 
			return false;
		else if (maze[x][y] != PATHWAY_COLOUR)
			return false;
		else if (x==N-1 && y == N-1) {
			maze[x][y] = PATH_COLOUR;
			return true;
		}
		else {
			maze[x][y] = PATH_COLOUR;
			if(findmazePath(x-1,y) || findmazePath(x,y+1) || findmazePath(x+1,y) || findmazePath(x,y-1))
				return true;
			maze[x][y] = BLOCKED_COLOUR;
			return false;
		}
		
	}

}
