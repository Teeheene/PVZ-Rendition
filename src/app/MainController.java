package app;

import model.*;
import view.*;

public class MainController
{
	private Board board; 
	private View view;
	private boolean isRunning;
	
	public MainController(Board board, View view)
	{
		this.board = board;
		this.view = view; 
	}
	
	public void start()
	{
		isRunning = true;
		gameLoop();
	}
	
	public void gameLoop()
	{
		//simple initialization
		//spawn 1 zombie that moves!
		Zombie test = new Zombie("z",10,10,1,new Position(4,1));
		Entity entityTest = new Entity(1,2,test.getName());
		board.setEntity(4,1,entityTest);
		while(isRunning)
		{
			test.move();
			board.update();
			
			render(board);
			try
			{
				Thread.sleep(16);
			} catch(InterruptedException e)
			{
				e.printStackTrace();
				isRunning = false;
			}
		}
	}
	
	public void render(Board board)
	{
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		view.showBoard(board);
	}
}