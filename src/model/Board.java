package model;

public class Board
{
	private Tile[][] board;
	private int width;
	private int height;
	
	public Board(int x, int y)
	{
		board = new Tile[x][y];
		
		this.width = x;
		this.height = y;
		
		//initialize the board 
		//im gonna make this with the idea of a matrix
		//where each entry right is a_ij, and i is a row
		//j is a column, and each starts at zero. 
		//
		//Why am i explaining this? Why not, its my project!
		// >:(
		for(int i = 0; i < y; i++)
		{
			for(int j = 0; j < x; j++)
			{
				board[j][i] = new Tile(new Position(i,j), null);
			}
		}
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	public Position getPos(int x, int y) { return board[x][y].getPos(); }
	public Entity getEntity(int x, int y) { return board[x][y].getEntity(); }
	
	public void setEntity(int x, int y, Entity entity) 
	{ 
		board[x][y].setEntity(entity);
	}
	
	public void update()
	{
		
	}
	
	public void printDebug()
	{
		for(int y = 0; y < height; y++)
		{
			for(int x = 0; x < width; x++)
			{
				board[x][y].getPos().printDebug();
			}
			System.out.println();
		}
	}
}